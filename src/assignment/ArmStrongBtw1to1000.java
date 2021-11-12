package assignment;

import java.util.Scanner;

class ArmStrongBtw99to100
{
static boolean isArmStrong(int x)
{
int sum=0,t=x;
int dc = countdigits(x);
do
{
int r = x%10;
sum = sum+pow(r,dc);
x=x/10;
}while(x!=0);
return sum == t;
}
static int countdigits(int y)
{
int count=0;
do{
y = y/10;
count++;
}while(y!=0);
return count;
}
static int pow(int v,int z)
{
int pw=1;
while(z>0)
{
pw=pw*v;
z--;
}
return pw;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
for(int i=10;i<=1000;i++){
 boolean rs = isArmStrong(i);
if(rs==true)
System.out.println("arm strong numbers between 1 to 1000 is ="+i);
}
}
}
