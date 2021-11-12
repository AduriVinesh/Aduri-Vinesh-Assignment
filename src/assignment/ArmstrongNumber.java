package assignment;

import java.util.Scanner;

class ArmStrongNumber{
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
System.out.println("enter the number");
int n = sc.nextInt();
boolean k = isArmStrong(n);
if(k==true)
System.out.println(n+"is arm strong number");
else
System.out.println(n+"is not arm strong number");
sc.close();
}
}
