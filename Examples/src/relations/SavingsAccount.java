package relations;

public class SavingsAccount extends Account {
	private double rate;
	
	public SavingsAccount(int id) {
		super(id, 0);
	}
	
	public void addInterest() {
		this.setBalance(this.getBalance() * rate);
	}
}
