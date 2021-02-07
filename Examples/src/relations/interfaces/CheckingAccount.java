package relations.interfaces;

/**
 * Checking account class
 * @author ISIS1126
 */
public class CheckingAccount extends Account {

	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	public boolean authorizeLoan(double amount) {
		return this.getBalance() >= 2*amount/3;
	}

}
