#!/bin/bash
prog=java.exe

#function declarations

delLogsAndTomcatStart()
{
echo deleting existing log...
rm -r $CATALINA_HOME/logs
echo existing logs deleted.
$CATALINA_HOME/bin/startup.bat 2>&1 > /dev/null
echo tomcat has started.
if [ "$1" = "interfaces" ]
then
cygstart http://localhost:9999/cargormifc/services/BookingUpdate?wsdl
else
cygstart http://localhost:9999/cargomax
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
if [ `ps -Waef|grep $prog|grep -v grep|wc -l` -gt 0 ]
then
echo Tomcat seems to be running...
else
echo starting up the tomcat...
delLogsAndTomcatStart interfaces
fi
}

##functions ending

case "$1" in

interfaces)
echo -n "enter code base details (example 'trunk' or '14.7') "
read source
echo deleting existing war from webapps...
rm -rf /drives/c/cargo_rm/apps/apache-tomcat-6.0.35/webapps/*
echo deleted.
echo copying.. cmaxifc.war from c/cargomax/svn/apdcargomax/$source/build/interfaces to webapps
cp /drives/c/cargomax/svn/apdcargomax/$source/build/interfaces/cmaxifc.war $CATALINA_HOME/webapps/
echo copied sucessfully.
start interfaces
;;

start)
start
;;


stop)
if [ `ps -Waef|grep $prog|grep -v grep|wc -l` -gt 0 ]
then
for pid in `ps -Waef|grep $prog|tr -s ' '|cut -d ' ' -f3`
do
killTomcatAndIE $pid
done
else
echo tomcat is not up.
fi
;;


restart)
if [ `ps -Waef|grep $prog|grep -v grep|wc -l` -gt 0 ]
then
for pid in `ps -Waef|grep java|tr -s ' '|cut -d ' ' -f3`
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


*)
echo "start|stop|restart|status|interfaces"
esac
