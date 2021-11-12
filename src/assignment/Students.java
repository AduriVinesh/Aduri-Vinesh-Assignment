package assignment;

import java.util.Scanner;


class SubjectMarks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in );
System.out.println("enter the marks");
int s1 = sc.nextInt();
int s2 = sc.nextInt();
int s3 = sc.nextInt();
if(s1>=60 && s2>=60 && s3>=60) 
System.out.println("pass");
else if((s1>=60 && s2>=60 && s3<60) || (s1>=60 && s3>=60 && s2<60) || (s2>=60 && s3>=60 && s1<60))
System.out.println("promoted");
else if((s1>=60 && s3<60 && s2<60) || (s2>=60 && s3<60 && s1<60) || (s3>=60 && s1<60 && s2<60)) 
	System.out.println("fail");
}
}
