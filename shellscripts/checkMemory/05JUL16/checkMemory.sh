#!/bin/bash
#echo `df -h`

if [ `df -h|grep /project/cmax|wc -l` -gt 0 ]
then
totalSize=`df -h|grep /project/cmax|tr -s ' '|cut -d ' ' -f2`
used=`df -h|grep /project/cmax|tr -s ' '|cut -d ' ' -f3`
avail=`df -h|grep /project/cmax|tr -s ' '|cut -d ' ' -f4`
usedPer=`df -h|grep /project/cmax|tr -s ' '|cut -d ' ' -f5|tr -d '%'`
topTenOccupied=`du -h /project/cmax 2> /dev/null|sort -h|tail -10`
echo "Total Size" $totalSize
echo "Used Space" $used
echo "Availabe Space" $avail
echo "Used space in percentage" $usedPer
if [ $usedPer -gt 80 ]
then
echo -e " Box has reached $usedPer% usage, Please do cleanup.\n \n More Details are as shown below \n \n Total Space on: $totalSize \n Used Space: $used \n Available Space: $avail \n **************************************** \n Below are the directories/files occupied more space on box \n **************************************** \n \n $topTenOccupied"|mail -s "Memory utilization on cmax box" srujan.kumar@sabre.com Madhusudhan.Rao@sabre.com 2>/dev/null
fi
else
echo "here"
echo "Unable to check usage on cmax box, since there is no location available with the name '/project/cmax'"|mail -s "Memory utilization on cmax box" srujan.kumar@sabre.com 2>/dev/null
fi
#percentage in `df -h|grep /project/cmax|tr -s ' '|cut -d ' ' -f5`

