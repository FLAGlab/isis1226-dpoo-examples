package relations.interfaces;

import java.util.ArrayList;

/**
 * Bank class - Account container
 * @author ISIS1126
 */
public class Bank {
	private ArrayList<IAccount> accounts;
	
	public Bank() {
		this.accounts = new ArrayList<IAccount>();
	}
	
	public void addAccount(IAccount account) {
		this.accounts.add(account);
	}
	
	public void addInterest() {
		for(IAccount acc : this.accounts) {
			acc.addInterest();
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		IAccount account;
		for(int i=1; i<=50; i++) {
			if(i %2 == 0) {
				account = new SavingsAccount(i, i*30.72);
			} else {
				account = new CheckingAccount(i, i*50.1);  
			}
			bank.addAccount(account);
		}
		bank.addInterest();
	}
}
