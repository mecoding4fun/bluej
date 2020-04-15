class megamart{
void accept(double tc){
if(tc <= 2000 ){
double dis = 5/100.0*tc;
double net = tc-dis;
System.out.println("The amount to be paid: " + net);
}
else if((tc >= 2001)&&(tc <= 5000) ){
double dis = 25/100.0*tc;
double net = tc-dis;
System.out.println("The amount to be paid: " + net);
}
else if((tc >= 5001)&&(tc <= 10000)){
double dis = 35/100.0*tc;
double net = tc-dis;
System.out.println("The amount to be paid: " + net);
}
else{
double dis = 50/100.0*tc;
double net = tc-dis;
System.out.println("The amount to be paid: " + net);
}
}
}

