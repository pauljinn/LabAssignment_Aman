package exercise1;

/**
 * Desc: Creates a saving account inherited from account.
 * @author Aman Soni
 *
 */
public class SavingsAccount extends Account {
	/**
	 * Additional final variable to ensure the minimum balance of 500 in account.
	 */
	private final double MINIMUM_BALANCE = 500;
	
	/**
	 * Parameterized Constructor.
	 */
	public SavingsAccount(double balance,Person person) {
		super(balance,person);
	}
	
	/**
	 * Overriding the withdraw method.
	 * It ensures that account have minimum balance of 500 for successful withdraw.
	 * @param amount.
	 */
	@Override
	public void withdraw(double amount) {
		/**
		 * Getting the current balance in account.
		 * Deducting the specific amount received as @param.
		 * Kepting it in newBalance variable.
		 */
		double newBalance = super.getBalance() - amount;
		/**
		 * Checking if the newBalance is greater than equal to minimum balance requried in account.
		 */
		if(newBalance>=MINIMUM_BALANCE) {
			/**
			 * If yes then setting the new balance to the account.
			 */
			super.setBalance(newBalance);
		}
		/**
		 * If no then displaying appropriate message.
		 */
		else {
			System.out.println("Can't withdraw as " +this.getAccHolder().getName()+" account don't have sufficient funds.");
		}
	}

}
