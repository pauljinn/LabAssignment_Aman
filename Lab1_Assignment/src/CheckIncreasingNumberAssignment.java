/**
 * Desc : Checking if the given number is increasing or not.
 * @author Aman Soni
 *
 */
public class CheckIncreasingNumberAssignment {

	public static void main(String[] args) {
		/**
		 * Checking for a given number whether it is increasing or not.
		 * Printing the appropriate output to console.
		 */
		if(checkNumber(134468))
			System.out.println("It is an increasing number");
		else
			System.out.println("It is not an increasing number");
	}
	
	/**
	 * A method to check whether the number is increasing or not.
	 * @param number specifies the number to check.
	 * @return true if number is increasing otherwise false.
	 */
	public static boolean checkNumber(int number) {
		/**
		 * Type casting the number of integer type to string.
		 */
		String numberString = Integer.toString(number);
		/**
		 * Running a loop to check if the next digit is greater than the previous digit of number.
		 */
		for(int i=1;i<numberString.length();i++) {
			/**
			 * Checking if the previous digit is greater than next digit in the number.
			 */
			if(Integer.parseInt(Character.toString(numberString.charAt(i-1)))>Integer.parseInt(Character.toString(numberString.charAt(i))))
				/**
				 * If yes then returning false as the number is not a increasing number.
				 */
				return false;
		}
		/**
		 * If the whole loop runs then this signifies the number is increasing hence returning true.
		 */
		return true;
	}

}
