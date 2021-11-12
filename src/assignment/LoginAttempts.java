package assignment;

import java.util.Scanner;

public class LoginAttempts
{
static void validation(String username, String password,int attempts)
{
	String name = "Vinesh";
			String pwd = "Vinesh@123";
			if(attempts<=3)
			{
				if(username.equals(name) && password.equals(pwd))
					System.out.println("Welcome......"+username);
				else
					System.out.println("invalid username and password");
				attempt(attempts);
				if(attempts>3)
					System.out.println("please contact the Admin");
			}
			
}
static void attempt(int attempts)
{
attempts++;	
}
    public static void main(String args[])
    {
    	int attempts=0;
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:user
        password = s.nextLine();
        validation(username, password, attempts);
        s.close();
    }
}
