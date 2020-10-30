/**
 * Desc : Checking if the number is power of 2 or not.
 * @author Aman Soni
 *
 */
public class CheckPowerofTwoNumberAssignment {

	public static void main(String[] args) {
		/**
		 * Checking for a given number whether it is power of 2 or not.
		 * Printing the appropriate message then.
		 */
		if(checkNumber(8))
			System.out.println("8 is a power of 2");
		else
			System.out.println("8 is not a power of 2");

	}
	
	/**
	 * A method to check whether a number is power of 2 or not.
	 * @param n specify the number to check.
	 * @return true if number is power of 2 otherwise false.
	 */
	public static boolean checkNumber(int n) {
		int count = 0;
		/**
		 * Running loop unconditionally for checking whether the power of 2 at count is equivalent to n.
		 */
		while(true) {
			/**
			 * Calculating the power of two at count.
			 */
			int powerOfTwo = (int) Math.pow(2,count);
			/**
			 * Checking if the power of two calculated is equivalent to the number received as @param
			 */
			if(powerOfTwo==n)
				/**
				 * If yes then returning true.
				 */
				return true;
			/**
			 * Checking if the current power of 2 on count exceeded the number passes as argument.
			 */
			else if(powerOfTwo>n)
				/**
				 * If yes then returning false.
				 */
				return false;
			/**
			 * Incrementing the count.
			 */
			count += 1;
		}
		
	}

}
