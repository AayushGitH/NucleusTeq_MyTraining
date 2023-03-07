package Training.week_4.inheritances;

public class LaonAccount extends Account 
{	
	// Other methods
	public void payEMI()
	{
		System.out.println("I am a EMI method in Loan process");
	}
	
	public void topUpLoan()
	{
		System.out.println("If you want top up loan , directly contact to the Manager");
	}
	
	public void repayment()
	{
		System.out.println("Money is about to repaid");
	}
}
