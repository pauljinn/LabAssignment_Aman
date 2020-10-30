/**
 * Desc : Modifying the number such that the each of the digit in
 *        the newly formed number is equal to the difference between 
 *	      two consecutive digits in the original number
 * @author Aman Soni
 *
 */
public class ModifyNumberAssignment {

	public static void main(String[] args) {
		/**
		 * Calling modifyNumber method to modify the given number.
		 */
		System.out.println(modifyNumber(45862));

	}
	
	/**
	 * A method to modify the number such that the each of the digit in the 
	  newly formed number is equal to the difference between two consecutive 
	  digits in the original number.
	 * Digit at unit place will be left as it is.
	 * Difference value is taken as absolute means no negative number is taken.
	 * @param number which needs to be modified.
	 * @return the modified number.
	 */
	public static int modifyNumber(int number) {
		/**
		 * Creating the string from the given number.
		 */
		String numberString = Integer.toString(number);
		/**
		 * Creating new string buffer empty object.
		 */
		StringBuffer sb = new StringBuffer("");
		/**
		 * Appending the unit place number as it is.
		 */
		sb.append(numberString.charAt(numberString.length()-1));
		/**
		 * Loop to run through each digit in the number left the unit place digit.
		 */
		for(int i=numberString.length()-2;i>=0;i--) {
			/**
			 * Appending the difference of two consecutive digit in the original number.
			 */
			int newDigit = Math.abs(Integer.parseInt(Character.toString(numberString.charAt(i))) - Integer.parseInt(Character.toString(numberString.charAt(i+1))));
			sb.append(Integer.toString(newDigit));
		}
		/**
		 * Returning the number by reversing it as appending is done in reverse order.
		 */
		return Integer.parseInt(sb.reverse().toString());
	}
}
