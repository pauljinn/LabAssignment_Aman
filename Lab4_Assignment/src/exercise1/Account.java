package exercise1;

/**
 * Desc: Opens a account for a person with a certain balance.
 * Supports deposit and withdraw functionality.
 * @author Aman Soni
 *
 */
public class Account {
	/**
	 *  Class Attributes.
	 */
	private static int count = 0;
	private long accNum=1;
	private double balance;
	private Person accHolder;
	
	/**
	 * Parameterized Constructor.
	 * @param balance for opening account balance.
	 * @param accHolder holding the details of person whose account is opened.
	 */
	public Account(double balance,Person accHolder) {
		/**
		 * Ensuring minimum balance in account is 500.
		 */
		this.balance = balance;
		this.accHolder = accHolder;
		Account.count += 1;
		this.accNum = Account.count;
	}
	
	/**
	 * Getter.
	 * @return the balance of the account.
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Set the balance of the account.
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Getter.
	 * @return the account holder person.
	 */
	public Person getAccHolder() {
		return this.accHolder;
	}
	
	/**
	 * Method to deposit amount in the account.
	 * @param amount
	 */
	public void deposit(double amount) {
		/**
		 * Adding the amount to current balance.
		 */
		double newBalance = this.getBalance() + amount;
		/**
		 * Setting the new balance in account.
		 */
		this.setBalance(newBalance);
		
	}
	
	/**
	 * Method to withdraw a amount from the account.
	 * @param amount
	 */
	public void withdraw(double amount) {
		/**
		 * Deducting the amount from the account.
		 */
		double newBalance = this.getBalance() - amount;
		/**
		 * Setting the new balance after deduction of amount.
		 */
		this.setBalance(newBalance);
	}

}
