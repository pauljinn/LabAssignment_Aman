/**
 * Desc : Printing all prime numbers upto to the integer entered by user.
 * @author Aman Soni
 *
 */
import java.util.Scanner;

public class PrimeNumberAssignment {

	public static void main(String[] args) {
		/**
		 * Taking the number from the user up till which prime numbers has to print.
		 */
		System.out.print("Enter the number upto which you wants to print the prime number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		/**
		 * Printing all the prime numbers till the number entered by the user.
		 */
		printPrimeUptoEnteredInteger(number);

	}
	
	/**
	 * A method to print all the prime numbers up to entered integer.
	 * @param enteredInteger tells about the limit up to which prime number has to print.
	 */
	public static void printPrimeUptoEnteredInteger(int enteredInteger) {
		/**
		 * Validating the enteredInteger.
		 */
		if(enteredInteger<=1)
			System.out.println("No prime number exist");
		/**
		 * After validation printing the prime number up to given number.
		 */
		else {
			/**
			 * Running loop on each number till enteredInteger.
			 */
			for(int i=2;i<=enteredInteger;i++) {
				/**
				 * Checking if the current number is prime.
				 */
				if(checkPrime(i))
					/**
					 * If it is prime then printing it to console.
					 */
					System.out.print(i+" ");
			}
		}
	}
	
	/**
	 * A method to check whether a given number is prime or not.
	 * @param number specifies the number to check for prime.
	 * @return true if the number is prime otherwise false.
	 */
	public static boolean checkPrime(int number) {
		/**
		 * Running loop from 2 till half of the number received.
		 * Because if the number is not divisible till half of it's value then it will be prime.
		 */
		for(int i=2;i<=number/2;i++) {
			/**
			 * If number is divisible by any number till half of it's value then returning false.
			 */
			if(number%i==0)
				return false;
		}
		/**
		 * Returning true because number is not divisible by any number except itself and 1.
		 */
		return true;
	}

}
