/**
 * Desc : Reading a line of integers and then displaying each integer and sum of all integers.
 * @author Aman Soni
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class LineSumAssignment {
	/**
	 * A method to take line of integers seperated by space.
	 * Call displayEachIntegerAndSum to display each integer and sum of all integers present in the line.
	 * @param args for taking arguments from command line.
	 */
	public static void main(String[] args) {
		System.out.print("Enter a line of integers separated by space: ");
		Scanner in = new Scanner(System.in);
		String integerLine = in.nextLine();
		in.close();
		displayEachIntegerAndSum(integerLine);
	}
	/**
	 * A method to display integers and the sum of them present in a line with space.
	 * @param integerLine represent a line of integers separated by spaces.
	 */
	public static void displayEachIntegerAndSum(String integerLine) {
		/**
		 * Creating an object of string tokenizer using integerLine and space(" ") as token.
		 */
		StringTokenizer st = new StringTokenizer(integerLine," ");
		/**
		 * A variable to store the sum of all integers present in the line.
		 */
		int sum = 0;
		System.out.print("All integers present in the line: ");
		/**
		 * Printing all the integers present in the line.
		 */
		while(st.hasMoreTokens()) {
			/**
			 * parseInt method of Integer to parse the string.
			 */
			int integer = Integer.parseInt(st.nextToken());
			System.out.print(integer + " ");
			sum += integer;
		}
		/**
		 * Printing the sum of all integer present in the line.
		 */
		System.out.println("\nSum of all the integers in the line: "+ sum);
	}

}
