package exercises;

import java.util.*;

/**
 * Desc: Sorting the number of the array after reversing each number.
 * @author Aman Soni
 *
 */
public class ReverseSortingAssignment {
	/**
	 * A method to sort the numbers in the array after reversing it.
	 * @param numbers an array of number.
	 * @return the sorted array of reversed numbers.
	 */
	public static Integer[] getSorted(int[] numbers) {
		/**
		 * Kept the sorted array of reversed number..
		 */
		Integer[] sortedNumbers = new Integer[numbers.length];
		/**
		 * Looping through each number in numbers array.
		 */
		for(int i=0;i<numbers.length;i++) {
			/**
			 * Creating a string builder using number.
			 */
			StringBuilder sb = new StringBuilder(Integer.toString(numbers[i]));
			/**
			 * Reversing the number.
			 */
			sortedNumbers[i] = Integer.parseInt(sb.reverse().toString());
		}
		/**
		 * Creating a list of reversed number.
		 */
		List<Integer> numberList = new ArrayList<>();
		for(Integer i:sortedNumbers) {
			numberList.add(i);
		}
		/**
		 * Sorting the list of reversed number.
		 */
		Collections.sort(numberList);
		/**
		 * Converting the list back to array of number.
		 */
		sortedNumbers = numberList.toArray(sortedNumbers);
		return sortedNumbers;
	}
	
	/**
	 * Testing the getSorted method.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * An array of numbers.
		 */
		int[] number = {123,653,100};
		/**
		 * Calling getSorted and storing the resultant array.
		 */
		Integer sortedReversedNumber[] = getSorted(number);
		/**
		 * Printing the reversed sorted array.
		 */
		System.out.println(Arrays.asList(sortedReversedNumber));

	}

}
