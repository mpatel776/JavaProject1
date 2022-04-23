
public class SavingsAccount extends BankAccount{
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name,double amount) {
		super(name,amount);
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	
	
	public SavingsAccount(SavingsAccount account, double amount) {
		super(account,amount);
		this.savingsNumber = account.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}



	public void postInterest() {
		double interest = super.getBalance()*rate*(1.0/12);
		super.deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	

}
