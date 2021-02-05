package relations;

public interface IAccount {
	public abstract boolean authorizeLoan(double amount);
	public abstract void addInterest();
}
