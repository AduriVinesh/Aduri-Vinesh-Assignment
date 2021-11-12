package assignment;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		try {
			int c=num/den;
			System.out.println("The output of divison is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Kindly don't provide the denominator value zero");
			
		}

	}

}
