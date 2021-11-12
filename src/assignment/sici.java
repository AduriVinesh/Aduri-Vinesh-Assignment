package assignment;
import java.util.Scanner;
class sici
{
	static double pow(double v,double z)
	{
	double pw=1;
	while(z>0)
	{
	pw=pw*v;
	z--;
	}
	return pw;
	}
    public static void main (String argu[ ])
{
    double pr, rate, t, sim,com;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * pow(1.0+rate/100.0,t) - pr;
    System.out.println("Simple Interest="+sim);
    System.out. println("Compound Interest="+com);
   }
}

