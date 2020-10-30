/**
 * Desc : Finding out the sum of cubes of a number.
 * @author Aman Soni
 *
 */
public class CubeSumAssignment {

	public static void main(String[] args) {
		/**
		 * Calling the cubeSum method to find the sum of cube of all the digit of the given number.
		 */
		int result = cubesum(1234);
		/**
		 * Printing the resultant sum.
		 */
		System.out.println("Sum of cubes of digit of number 1234 is: "+result);
	}
	
	/**
	 * Method to find the sum of cubes of the digits of a number.
	 * @param number for which sum of cube of digit to find.
	 * @return the sum of cube of digit of the number.
	 */
	public static int cubesum(int number) {
		/**
		 * Type casting the number from integer to string.
		 */
		String numberString = Integer.toString(number);
		/**
		 * A variable to hold the sum of cubes of digit of a number.
		 */
		int sum = 0;
		/**
		 * Running loop to access each digit of the number.
		 */
		for(int i=0;i<numberString.length();i++) {
			/**
			 * Type casting each digit in the number from string to integer.
			 */
			int digit = Integer.parseInt(Character.toString(numberString.charAt(i)));
			/**
			 * Adding the cube of digit to sum.
			 */
			sum += digit*digit*digit;
		}
		/**
		 * Returning the sum of cube of the number.
		 */
		return sum;
	}

}
