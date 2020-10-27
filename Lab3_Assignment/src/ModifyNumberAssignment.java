/**
 * Desc : Modifying the number such that the each of the digit in
 *        the newly formed number is equal to the difference between 
 *	      two consecutive digits in the original number
 * @author Aman Soni
 *
 */
public class ModifyNumberAssignment {

	public static void main(String[] args) {
		System.out.println(modifyNumber(45862));

	}
	
	/*
	 * A method to modify the number such that the each of the digit in the 
	 * newly formed number is equal to the difference between two consecutive 
	 * digits in the original number.
	 * Digit at unit place will be left as it is.
	 * Difference value is taken as absolute means no negative number is taken.
	 */
	public static int modifyNumber(int number) {
		String numberString = Integer.toString(number);
		StringBuffer sb = new StringBuffer("");
		sb.append(numberString.charAt(numberString.length()-1));
		for(int i=numberString.length()-2;i>=0;i--) {
			int newDigit = Math.abs(Integer.parseInt(Character.toString(numberString.charAt(i))) - Integer.parseInt(Character.toString(numberString.charAt(i+1))));
			sb.append(Integer.toString(newDigit));
		}
		return Integer.parseInt(sb.reverse().toString());
	}
}
