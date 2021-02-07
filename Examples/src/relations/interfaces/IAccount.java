package relations.interfaces;

/**
 * Account interface with common operations to all account types
 * @author ISIS1126
 */
public interface IAccount {
	public abstract boolean authorizeLoan(double amount);
	public abstract void addInterest();
}
