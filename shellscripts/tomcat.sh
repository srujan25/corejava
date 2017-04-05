#!/bin/bash
#SCRIPT: TOMCAT AUTOMATE DEPLOYMENT
#AUTHOR: SRUJAN
#DATE: 10-OCT-2016
#
#
# PURPOSE: This will help us to automate our daily usage of local tomcat as mentioned below.
#	  1. Start the tomcat. 
#	  2. Stop the tomcat.
#         3. Restart the tomcat.
#         4. Status of the tomcat.
#         5. Logs will get delete automatically, while tomcat is getting start.
#         6. Once tomcat is successfully started, Application will get open in IE as we specified URL
#	     in this variable 'APP_URL'.
#         7. Not only web application, by using this program we can deploy interface war file directly from our
#	     code base, once the deployment is successfully done, sample WSDL will get open in IE as we specified
#            serivce in this varaible 'INTERFACE_URL' 
#
# HOW TO USE: Below are the steps need to follow to run this program depends up on the event we want.
#	  1. To start - ./local_tomcat.sh start		
#         2. To Stop  - ./local_tomcat.sh stop
#         3. To Restart- ./local_tomcat.sh stop
#         4. To Deploy interface war and to start - ./local_tomca.sh interfaces
#            We need to give input what is the location of your code base, it will take
#	     automatically from the build/interfaces folder and it will deploy in webapps of tomcat
#
# CONFIGURATION REQUIRED:
#	  1. Need to set CATALINA_HOME in environment variable, because through out this program it will take
#            reference from this variable.
#         2. In this shell script, need to change the APP_URL variable with required URL to be opend once tomcat is up.
#         3. INTERFACE_URL to be updated with required URL to be opened once interface deployment is done.
	
PROCESS_TO_KILL=java.exe

APP_URL=http://localhost:9999/cargomax
INTERFACE_URL=http://localhost:9999/cargormifc/services/BookingUpdate?wsdl
BUILD_HTML_FAILURE=C://BuildFail.html
BUILD_HTML_SUCESS=C://BuildSucess.html

#function declarations

delLogsAndTomcatStart()
{
echo deleting existing log...
rm -r $CATALINA_HOME/logs
echo existing logs deleted.
echo "This is the tomcat location accessing from CATALINA_HOME if you want use another one, please update CATALINA_HOME :"$CATALINA_HOME
$CATALINA_HOME/bin/startup.bat
echo tomcat has started.
if [ "$1" = "interfaces" ]
then
sleep 20
cygstart $INTERFACE_URL
else
sleep 20
cygstart $APP_URL
fi
}

killTomcatAndIE()
{
echo killing $1
taskkill /pid $1 2>&1 > /dev/null
taskkill /f /im iexplore.exe
}

start()
{
if [ `ps -Waef|grep $PROCESS_TO_KILL|grep -v grep|wc -l` -gt 0 ]
then
echo Tomcat seems to be running...
elif [ "$1" = "YES_BUILD_ERRORS" ]
then
echo Build Failed...
cygstart  $BUILD_HTML_FAILURE
elif [ "$1" = "NO_BUILD_ERRORS" ]
then
echo Build Sucess...
cygstart $BUILD_HTML_SUCESS
sleep 5
echo starting up the tomcat...
delLogsAndTomcatStart $1
elif [ "$1" = "ONLY_START" ]
then
echo starting up the tomcat...
delLogsAndTomcatStart $1
fi
}

buildGUIAndStart()
{
if [ `ps -Waef|grep $PROCESS_TO_KILL|grep -v grep|wc -l` -gt 0 ]
then
stop
echo Tomcat was running.. stopped all running process...
echo building webapp now...
pushd $CODE_BASE > /dev/null
rm  build_log* > /dev/null
ant -Dmaven.offline=true copy.web.dev > 'build_log_'$(date +%F)
log_file='build_log_'$(date +%F)
count=$(grep -c 'BUILD SUCCESSFUL' $log_file)
popd
if [ $count -gt 0 ]
then
start "NO_BUILD_ERRORS"
else
start "YES_BUILD_ERRORS"
#echo "Dude Failed..."
fi
fi
}
##functions ending

case "$1" in

interfaces)
if [ `ps -Waef|grep $PROCESS_TO_KILL|grep -v grep|wc -l` -gt 0 ]
then
echo Tomcat seems to be running...
else
echo -n "enter code base details (example 'trunk' or '14.7') "
read source
echo deleting existing war from webapps...
rm -rf /drives/c/cargo_rm/apps/apache-tomcat-6.0.35/webapps/*
echo deleted sucessfully.
echo copying.. cmaxifc.war from c/cargomax/svn/apdcargomax/$source/build/interfaces to webapps
cp /drives/c/cargomax/svn/apdcargomax/$source/build/interfaces/*.war $CATALINA_HOME/webapps/cargormifc.war
#mv /drives/c/cargomax/svn/apdcargomax/$source/build/interfaces/cmaxifc.war /drives/c/cargomax/svn/apdcargomax/$source/build/interfaces/cargormifc.war
echo copied sucessfully.
start interfaces
fi
;;

start)
start "ONLY_START"
;;


stop)
if [ `ps -Waef|grep $PROCESS_TO_KILL|grep -v grep|wc -l` -gt 0 ]
then
for pid in `ps -Waef|grep $PROCESS_TO_KILL|tr -s ' '|cut -d ' ' -f3`
do
killTomcatAndIE $pid
done
else
echo tomcat is not up.
fi
;;


restart)
if [ `ps -Waef|grep $PROCESS_TO_KILL|grep -v grep|wc -l` -gt 0 ]
then
for pid in `ps -Waef|grep $PROCESS_TO_KILL|tr -s ' '|cut -d ' ' -f3`
do
killTomcatAndIE $pid
done
echo restarting tomcat...
delLogsAndTomcatStart
else
echo tomcat is not up use start option.
fi
;;

status)
if [ `ps -Waef|grep $prog|grep -v grep|wc -l` -gt 0 ]
then
echo tomcat is up.
else
echo tomcat is down.
fi
;;

webapp)
buildGUIAndStart
;;


*)
echo "start|stop|restart|status|interfaces|webapp"
esac
