#!/usr/bin/perl
use warnings;

$i=0;
while($i<100){
	$str = <STDIN>;
	@strArray = split('',$str);
	$j=0;
	while($j<=$#strArray){
		if(($strArray[$j] eq "[" && $strArray[$j+1] eq "]") || ($strArray[$j] eq "{" && $strArray[$j+1] eq "}") || ($strArray[$j] eq "(" && $strArray[$j+1] eq ")")){
			splice(@strArray,$j,2);
			$j=0;
		}
		else{
			$j++;
		}
	}
	if($#strArray==0){
		print "true\n";
	}
	else{
		print "false\n";
	}
	$i++;
}
