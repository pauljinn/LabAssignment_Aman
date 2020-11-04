package exercises;

import java.util.*;

/**
 * Desc: Finding the second smallest element in the array.
 * @author Aman Soni
 *
 */
public class SecondSmallestAssignment {
	
	/**
	 * Find the second smallest element in the array of numbers.
	 * @param numbers an array of number.
	 * @return the second smallest element in the array.
	 */
	public static int getSecondSmalles(int[] numbers) {
		/**
		 * Initializing the list of numbers.
		 */
		List<Integer> numberList = new ArrayList<>();
		/**
		 * Looping through each number in the array.
		 */
		for(Integer i: numbers) {
			/**
			 * Adding each number to list.
			 */
			numberList.add(i);
		}
		/**
		 * Sorting the list.
		 */
		Collections.sort(numberList);
		/**
		 * Returning the number at second index because it is second smallest.
		 */
		return numberList.get(1);
		
	}

	public static void main(String[] args) {
		int[] numbers = {5,6,4,3};
		System.out.println(getSecondSmalles(numbers));
	}

}
