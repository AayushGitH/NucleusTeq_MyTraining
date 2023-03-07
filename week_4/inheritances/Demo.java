package Training.week_4.inheritances;

public class Demo 
{
	public static void main(String...args)
	{
		Account acc = new Account(98273558, "Aayush Tiwari", "Jakhya front of govt.School", 9826921, "15-09-2000", 25000);
		
		System.out.println(acc.getDob());
		Account sa = new SavingsAccount();
		sa.setAccountNo(78987);
		System.out.println(sa.getAccountNo());
	}
}
