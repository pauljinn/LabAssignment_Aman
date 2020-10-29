package exercise1;
/**
 * Desc: Creates current account inherited from account.
 * @author Aman Soni
 */
public class CurrentAccount extends Account{
	/**
	 * Additional variable name overdraft limit is added.
	 */
	private double overDraftLimit;
	/**
	 * Parameterized constructor.
	 * @param balance to open current account with initial balance.
	 * @param person to open current account for a person.
	 * @param overDraftLimit to withdraw till this limit even when the balance in account is zero.
	 */
	public CurrentAccount(double balance,Person person,double overDraftLimit) {
		super(balance,person);
		this.overDraftLimit = overDraftLimit;
	}
	/**
	 * Overriding the withdraw method according to overDraftLimit.
	 * @param amount for withdrawing certain amount. 
	 */
	public void withdraw(double amount) {
		/**
		 * Getting the initial balance in the current account.
		 * Deducting the amount received and keeping it in newBalance variable.
		 */
		double newBalance = this.getBalance() - amount;
		/**
		 * Checking if the new balance is less than or equal to 0.
		 * If so checking whether the overDraftLimit is reached by taking the absolute value of new balance.
		 * Absolute value is taken as overdraft limit tells how much a person can withdraw even if it's account has 0 balance.
		 */
		if(newBalance<=0) {
			if(Math.abs(newBalance)<this.overDraftLimit) {
				/**
				 * If overdraft limit is not reached then simply setting the new balance.
				 */
				this.setBalance(newBalance);
			}
			/**
			 * If overdraft limit is reached then stopping the withdraw and displaying appropriate message.
			 */
			else {
				System.out.println("Can't withdraw as "+this.getAccHolder().getName() + " account overdraft limit is reached.");
			}
		}
		/**
		 * If account balance is still greater than 0 then simply setting the new balance after withdrawing.
		 */
		else {
			this.setBalance(newBalance);
		}
	}

}
