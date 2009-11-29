for x in $(ls test/basic_*.slippy); 
do echo "------------------- $x"; ./interp $x; 
done
echo "Complete at " `date`
