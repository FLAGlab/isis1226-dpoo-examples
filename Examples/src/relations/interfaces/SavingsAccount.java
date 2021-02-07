package relations.interfaces;

/**
 * Savings account example
 * @author ISIS1126
 */
public class SavingsAccount extends Account {
	private double rate;
	
	public SavingsAccount(int id, double ammount) {
		super(id, 0);
	}
	
	@Override
	public void deposit(int amount) {
		super.deposit(amount);
	}
	
	@Override
	public boolean authorizeLoan(double amount) {
		return this.getBalance() >= amount/2;
	}
	
	public void addInterest() {
		this.setBalance(this.getBalance() * rate);
	}
}
