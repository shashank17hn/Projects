package deadLock;

public class Account {
	
	private int balance=1000; 
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposite(int amount)
	{
		balance += amount;
	}
	
	public void withdraw(int amount)
	{
		balance -= amount;
	}
	
	public static void transfer(Account acc1, Account acc2, int amount)
	{
		acc1.withdraw(amount);
		acc2.deposite(amount);
	}

}
