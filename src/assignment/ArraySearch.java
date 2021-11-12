package assignment;

import java.util.Scanner;

class ArraySearch
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
int num [] = new int[15]; 
for(int i = 0;i<num.length; i++)
{
num[i] = sc.nextInt();	
}
System.out.println("enter the number");
int n = sc.nextInt();
for(int i = 0;i<num.length; i++)
{
if(n==num[i])
	System.out.println("number is present");
else
	System.out.println("number is not present");
}
sc.close();
}
}