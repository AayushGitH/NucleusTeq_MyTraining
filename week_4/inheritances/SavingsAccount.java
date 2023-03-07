package Training.week_4.inheritances;

public class SavingsAccount extends Account {
	
	// Other methods
	public void withdraw() {
		System.out.println("Money is about to withdraw");
	}

	public void deposit() {
		System.out.println("Money is to be deposited");
	}

	public void fixedDeposit() {
		System.out.println("Fixed deposit will start from now");
	}
}
