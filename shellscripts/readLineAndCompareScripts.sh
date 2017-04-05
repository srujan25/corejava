#!/bin/ksh
file=$1
present=0
notPresent=0
totalLines=0
while IFS= read line
do
	totalLines=`expr $totalLines + 1`
	script=$(echo "$line"|tr -s ' '|cut -d ' ' -f9)
	script="/project/cmax/home/cmaxvs/batch-autobuild-cmax4vsbranch146dev/cargomax/prod/scripts/"$script
	if [ -f $script ]
	then
		present=`expr $present + 1`
	else
		notPresent=`expr $notPresent + 1`
	fi
done <"$file"

echo "-----------------------------------------------------------------"
echo "Total no.of scripts read from input file---> "$totalLines
echo "Total no.of scripts are matching with current scripts---> "$present
echo "Total no.of scripts are not matching with current scripts---> "$notPresent
echo "------------------------------------------------------------------"
