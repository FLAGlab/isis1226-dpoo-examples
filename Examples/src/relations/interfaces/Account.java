package relations.interfaces;

/**
 * Generic account answering to a class
 * @author ISIS1126
 */
public class Account implements IAccount {
	private int id;
	private double balance;
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}
	
	/*
	 * Default accounts are not authorized to get loans
	 */
	@Override
	public boolean authorizeLoan(double amount) {
		return false;
	}

	@Override
	public void addInterest() {
		//skip
	}
}
