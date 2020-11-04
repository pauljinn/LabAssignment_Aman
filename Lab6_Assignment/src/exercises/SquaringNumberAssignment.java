package exercises;

import java.util.*;

/**
 * Desc: Finding square of each number in array.
 * Making a map having number as key and it's square as value.
 * @author Aman Soni
 *
 */
public class SquaringNumberAssignment {
	
	/**
	 * A method to calculate square of each number in array.
	 * Creates a map with number as key and it's square as value.
	 * @param arr an array of numbers.
	 * @return the map.
	 */
	public static Map<Integer,Integer> getSquares(int[] arr){
		/**
		 * A map to keep number as key and it's square as value.
		 */
		Map<Integer,Integer> numberMap = new HashMap<>();
		/**
		 * Looping through each number in array received as argument.
		 */
		for(Integer i:arr) {
			/**
			 * Calculating the square of each number and putting in map.
			 */
			numberMap.put(i,i*i);
		}
		return numberMap;
	}

	public static void main(String[] args) {
		/**
		 * An array of numbers.
		 */
		int[] arr = {1,2,3,4,5};
		/**
		 * Calling the getSquare method and printing the returned map.
		 */
		System.out.println(getSquares(arr));

	}

}
