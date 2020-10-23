/**
 * Desc : Finding difference between sum of square of n natural number and square of sum of n natural numbers.
 * @author Aman Soni
 *
 */
public class CalculateDifferenceAssignment {

	public static void main(String[] args) {
		System.out.println("Difference between sum of square of 10 natural numbers and square of sum of 10 natural numbers is: "+calculateDifference(3));
	}
	
	public static int calculateDifference(int n) {
		int sumSquare = 0;
		int sumNumberSquare = 0;
		for(int i=1;i<=n;i++) {
			sumSquare += i;
			sumNumberSquare += i*i;
		}
		sumSquare *= sumSquare;
		int sum = sumNumberSquare - sumSquare;
		return sum;
	}

}
