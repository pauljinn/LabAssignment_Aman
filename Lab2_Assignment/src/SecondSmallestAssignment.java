/**
 * Desc : Accepting an array of integer elements and finding the second smallest element in it.
 * @author Aman Soni
 *
 */
public class SecondSmallestAssignment {

	public static void main(String[] args) {
		/**
		 * Creating an array of integers.
		 */
		int integerArray[] = {9,4,2,7};
		/**
		 * Printing the second smallest element in the array by calling appropriate method.
		 */
		System.out.println("The second smallest element in the array is: " + getSecondSmallest(integerArray));

	}
	/**
	 * A method to return second smallest element in the integer array.
	 * @param integerArray whose second smallest element has to find.
	 * @return the second smallest element from integerArray.
	 */
	public static int getSecondSmallest(int[] integerArray) {
		/**
		 * Sorting the array received using bubble sort.
		 */
		for(int i=0;i<integerArray.length-1;i++) {
			/**
			 * Checking if swapping is done in internal loop.
			 */
			boolean swap = false;
			for(int j=0;j<integerArray.length-i-1;j++) {
				if(integerArray[j]>integerArray[j+1]) {
					swap = true;
					int temp = integerArray[j];
					integerArray[j] = integerArray[j+1];
					integerArray[j+1] = temp;
				}
			}
			/**
			 * If no swapping is done then that means array is already sorted hence no need to run loop again.
			 */
			if(!swap)
				break;
		}
		/**
		 * Returning the second element of the sorted array as it would be second smallest in the array.
		 */
		return integerArray[1];
	}

}
