/**
 * Desc : Finding difference between sum of square of n natural number and square of sum of n natural numbers.
 * @author Aman Soni
 *
 */
public class CalculateDifferenceAssignment {

	public static void main(String[] args) {
		System.out.println("Difference between sum of square of 10 natural numbers and square of sum of 10 natural numbers is: "+calculateDifference(3));
	}
	/**
	 * Method to calculate the difference between sum of square of all natural number and square of sum of all natural numbers.
	 * @param n tells how many natural number should be considered starting from 1.
	 * @return sum which is difference between n natural numbers square sum and sum square.
	 */
	public static int calculateDifference(int n) {
		int sumSquare = 0;
		int sumNumberSquare = 0;
		/**
		 * Calculating the sum of natural numbers upto n.
		 * Calculating the sum of square of natural numbers upto n.
		 */
		for(int i=1;i<=n;i++) {
			sumSquare += i;
			sumNumberSquare += i*i;
		}
		/**
		 * Squaring the sum of n natural numbers.
		 */
		sumSquare *= sumSquare;
		/**
		 * Calculating the difference between sum of square and square of sum of n natural numbers.
		 */
		int difference = sumNumberSquare - sumSquare;
		/**
		 * Returning the difference.
		 */
		return difference;
	}

}
