/**
 * Desc : Calculating the sum of first n natural numbers divisible by 3 or 5.
 * @author Aman Soni
 *
 */
public class CalculateSumAssignment {

	public static void main(String[] args) {
		/**
		 * Printing the sum of first 5 natural numbers divisible by 3 or 5.
		 */
		System.out.println("Sum of first 5 natural numbers: "+calculateSum(5));

	}
	/**
	 * Method to find the sum of first n natural numbers which are divisible by 3 or 5..
	 * @param n tells about the limit upto which natural number sum has to be calculated.
	 * @return the sum of the n natural numbers divisible by 3 or 5.
	 */
	public static int calculateSum(int n) {
		/**
		 * Checking if the n is valid.
		 */
		if(n<=0)
			System.out.println("Provide valid n");
		int sum = 0;
		/**
		 * Loop to calculate the sum of n natural numbers divisible by 3 or 5.
		 */
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum += i;
		}
		/**
		 * Returning the sum.
		 */
		return sum;
	}

}
