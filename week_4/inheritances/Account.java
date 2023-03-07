// Program of inheritance
package Training.week_4.inheritances;

import java.util.Date;

// Parent class
public class Account 
{
	// Properties
	long accountNo;
	String name;
	String address;
	long phoneNo;
	String dob;
	int balance;
	
	// Parameterized constructor
	public Account(long accountNo, String name, String address, long phoneNo, String dob, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.balance = balance;
	}
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	// Getters and Setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// Other methods
	public void closeAccount()
	{
		System.out.println("Account is closing");
	}
	
}
