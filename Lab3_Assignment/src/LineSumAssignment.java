/**
 * Desc : Reading a line of integers and then displaying each integer and sum of all integers.
 * @author Aman Soni
 *
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class LineSumAssignment {
	/*
	 * A method to take line of integers seperated by space.
	 * Call displayEachIntegerAndSum to display each integer and sum of all integers present in the line.
	 */
	public static void main(String[] args) {
		System.out.print("Enter a line of integers separated by space: ");
		Scanner in = new Scanner(System.in);
		String integerLine = in.nextLine();
		displayEachIntegerAndSum(integerLine);
	}
	public static void displayEachIntegerAndSum(String integerLine) {
		StringTokenizer st = new StringTokenizer(integerLine," ");
		int sum = 0;
		System.out.print("All integers present in the line: ");
		while(st.hasMoreTokens()) {
			int integer = Integer.parseInt(st.nextToken());
			System.out.print(integer + " ");
			sum += integer;
		}
		System.out.println("\nSum of all the integers in the line: "+ sum);
	}

}
