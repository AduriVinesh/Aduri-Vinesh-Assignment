package assignment;
import java.util.Scanner;

public class BubbleSort
{
static void bubbleSort(int a[],int key)	
{
int j,temp;
for(j=0;j<a.length;j++)		
{
if(a[j] > a[j+1])				
{		
temp=a[j];		
a[j]=a[j+1];		
a[j+1]=temp;				
}
}		
}

public static void main(String[] args)	
{
Scanner sc=new Scanner(System.in);
int a[]=new int[15];
int i,key;
System.out.println("Enter 15 elements in the array: ");
for(i=0;i<15;i++)		
{
a[i]=sc.nextInt();		
}
key=sc.nextInt();
bubbleSort(a,key);
for(i=0;i<a.length;i++)		
{
System.out.print(a[i]);		
}
}
}
