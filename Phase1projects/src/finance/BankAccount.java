package finance;

public class BankAccount {
	
	public int accountNumber;
	public int balanceTotal;
	static String bankName = "SBI";
	static double interestRate = 7.2;
	
	// default constructor
	public BankAccount() {
//		this.accountNumber = accountNum;
//		this.balanceTotal = total;
	}
	
	 public void printAccount() {
		System.out.println("Welcome to " + BankAccount.bankName);
		System.out.println("Current Loan Interest Rate " + BankAccount.interestRate);
		System.out.println("AccountNumber: " + this.accountNumber);
		System.out.println("Available Balance: " + this.balanceTotal);
		System.out.println("-------");
	}

}