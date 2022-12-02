class calculator 
{
int first;
int second;
int sumResult;
int substractResult;
int multiplicationResult;
int remResult;
double divResult;


Calculator(int a,int b)
{
first=a;
second=b;
}
public void performAdd()
{
sumResult=first+second;
}
public void performSubstract()
{
sumResult=first-second;
}
public void performMultiplication()
{
multiplicationResult=first*second;
}
public void performDiv()
{
divResult=first/second;
}
public void performRem()
{
remResult=first%second;
}
class CalculatorManager
{
public static void main(String args[])

calculator c1=new calculator(10,5);
c1.performAdd();
c1.displaySum();

c2.performSubstraction();
c2.displaySubstraction();

c3.performMultiplication();
c3.displayMultiplication();

c4.performRem();
c4.displayRem();

c5.performDiv();
c5.displayDiv();
}
}
}
