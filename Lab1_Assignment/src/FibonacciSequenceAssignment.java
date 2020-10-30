/**
 * Desc : Printing nth value of the fibonacci sequence by using recursive and non recursive function.
 * @author Aman Soni
 *
 */
public class FibonacciSequenceAssignment {

	public static void main(String[] args) {
		/**
		 * Finding the 7th term if fibonacci series using both recursive and non-recursive methods.
		 * Printing the appropriate message and the 7th term.
		 */
		System.out.println("7th term using non recursive approach: "+printFibonacciNonRecursively(7));
		System.out.println("7th term using recursive approach: " + printFibonacciRecursively(7));

	}
	
	/**
	 * A method to print the fibonacci series n term using non recursive approach.
	 * @param nTerm tells about the term of fibonacci series to find.
	 * @return the n term of fibonacci series.
	 */
	public static int printFibonacciNonRecursively(int nTerm) {
		/**
		 * Validating the nth term.
		 */
		if(nTerm<=0)
			System.out.println("Provide right nth term");
		/**
		 * Checking if the nth term is 1 or 2.
		 * If so simply returning 1 as 1st and 2nd term in fibonacci series is 1.
		 */
		else if(nTerm==1 || nTerm==2)
				return 1;
		/**
		 * Initializing the next term and previous term with 1 to find the nth term.
		 */
		int nextTerm = 1;
		int prevTerm = 1;
		/**
		 * Running loop from the 3 till nTerm to find the nth term in fibonacci series.
		 */
		for(int i=3;i<=nTerm;i++) {
				/**
				 * A temporary variable to hold the current next term.
				 */
				int temp = nextTerm;
				/**
				 * Updating the next term by adding previous term and current next term.
				 */
				nextTerm = nextTerm + prevTerm;
				/**
				 * Updating the previous term using the temporary variable.
				 */
				prevTerm = temp;
		}
		/**
		 * Returning the nth term of fiboancci series.
		 */
		return nextTerm;
	}
	
	/**
	 * A method to print the fibonacci series n term using recursive approach.
	 * @param nTerm tells about the term of fibonacci series to find.
	 * @return the n term of fibonacci series.
	 */
	public static int printFibonacciRecursively(int nTerm) {
		/**
		 * Validating the nTerm.
		 */
		if(nTerm<=0)
			System.out.println("Provide right nth term");
		/**
		 * Checking if the nth term is 1 or 2.
		 * If so simply returning 1 as 1st and 2nd term in fibonacci series is 1.
		 */
		else if(nTerm==1 || nTerm==2)
			return 1;
		/**
		 * Calling the function recursively on previous two terms.
		 * Adding their result to find the current term.
		 * Returning the final nth term after calculation.
		 */
		return printFibonacciRecursively(nTerm-1) + printFibonacciRecursively(nTerm-2);
	}

}
