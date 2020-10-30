/**
 * Desc : Removing duplicates from the integer array and then sorting it in descending order.
 * @author Aman Soni
 *
 */
public class RemoveDuplicateAssignment {

	public static void main(String[] args) {
		/**
		 * Creating an array of duplicate numbers.
		 */
		int numberArray[] = {10,10,3,3,50,20,70,70};
		/**
		 * Calling the modifyArray method to remove all the duplicates and sorting it in descending order 
		 * Then storing the returned array in noDuplicateArray variable. 
		 */
		int noDuplicateArray[] = modifyArray(numberArray);
		/**
		 * Printing the resultant array.
		 */
		System.out.print("Array after removing all the duplicates and sorted in descending order is: ");
		for(Integer i: noDuplicateArray) {
			System.out.print(i+" ");
		}
	}
	/**
	 * A method to remove all the duplicates from the integer array and then sort it in descending order.
	 * @param numberArray input array from which duplicate has to be removed
	 * @return the array of integers having no duplicates.
	 */
	public static int[] modifyArray(int[] numberArray) {
		/**
		 * First let's just sort the array in ascending order this will help in finding duplicates.
		 */
		for(int i=0;i<numberArray.length-1;i++) {
			/**
			 * Checking if swapping is done in internal loop.
			 */
			boolean swap = false;
			for(int j=0;j<numberArray.length-i-1;j++) {
				if(numberArray[j]>numberArray[j+1]) {
					swap = true;
					int temp = numberArray[j];
					numberArray[j] = numberArray[j+1];
					numberArray[j+1] = temp;
				}
			}
			/**
			 * If no swapping is done then that means array is already sorted hence no need to run loop again.
			 */
			if(!swap)
				break;
		}
		/**
		 * An array to store whether the number at particular index is duplicate or not.
		 */
		boolean[] duplicates  = new boolean[numberArray.length];
		/**
		 * Finding duplicates at particular index and according updating the duplicates array.
		 */
		for(int i=0;i<numberArray.length-1;i++) {
			for(int j=i+1;j<numberArray.length;j++) {
				/**
				 * Checking if the number at inner loop index is same as number at outer loop index.
				 * If so putting true at index equal to inner loop counter in duplicates array.
				 */
				if(numberArray[j]==numberArray[i]) {
					duplicates[j] = true;
				}
			}
		}
		/**
		 * Finding the length of array having no duplicates
		 */
		int nonDuplicateArrayLength = 0;
		for(int i=0;i<duplicates.length;i++) {
			/**
			 * Checking if the duplicate array have false at index equal to loop counter.
			 * If yes then incrementing the nonDuplicateArrayLength counter.
			 */
			if(!duplicates[i]) {
				nonDuplicateArrayLength += 1;
			}
		}
		/**
		 * Instantiating a non duplicate array with length equals nonDuplicateArrayLength find earlier.
		 */
		int nonDuplicateArray[] = new int[nonDuplicateArrayLength];
		/**
		 * A counter to keep count of the indexes filled in non duplicate array.
		 */
		int index = 0;
		/**
		 * Filling the non duplicate array using a variable index that keeps count of non duplicate array index filled.
		 */
		for(int i=0;i<duplicates.length;i++) {
			/**
			 * Checking if the number at current index is duplicate.
			 */
			if(!duplicates[i]) {
				/**
				 * If number is not duplicate then at adding that number to non duplicate array at index.
				 */
				nonDuplicateArray[index] = numberArray[i];
				/**
				 * Incrementing the index counter by 1 for next non duplicate element.
				 */
				index += 1;
			}
		}
		/**
		 * Sorting the non duplicate array in descending order using bubble sort.
		 */
		for(int i=0;i<nonDuplicateArray.length-1;i++) {
			/**
			 * Checking if swapping is done in internal loop.
			 */
			boolean swap = false;
			for(int j=0;j<nonDuplicateArray.length-i-1;j++) {
				if(nonDuplicateArray[j]<nonDuplicateArray[j+1]) {
					swap = true;
					int temp = nonDuplicateArray[j];
					nonDuplicateArray[j] = nonDuplicateArray[j+1];
					nonDuplicateArray[j+1] = temp;
				}
			}
			/**
			 * If no swapping is done then that means array is already sorted hence no need to run loop again.
			 */
			if(!swap)
				break;
		}
		return nonDuplicateArray;
		
	}

}
