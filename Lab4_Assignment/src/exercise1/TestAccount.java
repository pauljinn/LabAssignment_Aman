package exercise1;

/**
 * Desc: Testing simple account, saving account and current account by withdrawing and depositing certain amount for a particular person.
 * @author Aman Soni
 *
 */
public class TestAccount {

	public static void main(String[] args) {
		/**
		 * Creating account for Smith with initial balance 2000.
		 */
		Person smith = new Person();
		smith.setName("Smith");
		Account accountSmith = new Account(2000,smith);
		/**
		 * Creating account for Kathy with initial balance 3000.
		 */
		Person kathy = new Person();
		kathy.setName("Kathy");
		Account accountKathy = new Account(3000,kathy);
		/**
		 * Depositing 2000 in Smith account.
		 */
		accountSmith.deposit(2000);
		/**
		 * Withdrawing 2000 from Kathy account.
		 */
		accountKathy.withdraw(2000);
		/**
		 * Displaying updated balance in Smith and Kathy account.
		 */
		System.out.println("Balance of Smith account after depositing 2000 INR is: "+accountSmith.getBalance());
		System.out.println("Balance of Kathy account after withdrawing 2000 INR is: "+accountKathy.getBalance());
		/**
		 * Creating smith savings account.
		 * Testing savings account class.
		 */
		SavingsAccount savingsAccountSmith = new SavingsAccount(2000,smith);
		/**
		 * Withdrawing 3000 INR from Smith's savings account.
		 */
		savingsAccountSmith.withdraw(3000);
		/**
		 * Creating current account for Kathy.
		 * Testing current account class.
		 */
		CurrentAccount currentAccountKathy = new CurrentAccount(3000,kathy,500);
		/**
		 * Withdrawing 3500 which is the overdraft limit for Kathy account.
		 */
		currentAccountKathy.withdraw(3500);

	}

}
