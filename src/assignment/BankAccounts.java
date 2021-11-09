package assignment;
public class BankAccounts 
{
	public static void main(String[] args) {
		int a1,a2,TotalCash;
		SavingsAccount b1=new SavingsAccount();
		CurrentAccount b2= new CurrentAccount();
		a1 = b1.cash();
		a2= b2.cash();
		TotalCash=a1+a2;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

	
}
class SavingsAccount extends BankAccounts
{
	int cash()
	{
		int FixedDeposit=100000;
		return FixedDeposit;
		
	}
}
class CurrentAccount extends BankAccounts
{
	int cash()
	{
		int CashCredit=200000;
		return CashCredit;
	}
}
