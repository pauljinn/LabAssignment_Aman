package exercises;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Desc: Fetching the values from a hash map and returning the list of these values in sorted order.
 * @author Aman Soni
 *
 */
public class HashMapAssignment {
	
	/**
	 * A method to sort the values of a hash map.
	 * @param hashMap whose values needs to sort.
	 * @return the list of sorted values.
	 */
	public static List<Integer> getValues(HashMap<Integer,Integer> hashMap){
		/**
		 * List to kept the sorted values of hash map.
		 */
		List<Integer> sortedList = new ArrayList<>();
		/**
		 * Contains the key of the map.
		 */
		Set<Integer> keySet = hashMap.keySet();
		/**
		 * Looping over each key in the map and adding the corresponding value to list.
		 */
		for(Integer i: keySet) {
			sortedList.add(hashMap.get(i));
		}
		/**
		 * Sorting the list of values of map and returning the sorted list.
		 */
		return sortedList.stream().sorted().collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		/**
		 * Creating a hashMap.
		 */
		HashMap<Integer,Integer> hashMap = new HashMap<>();
		/**
		 * Adding some random values to hashMap.
		 */
		hashMap.put(1, 2);
		hashMap.put(2, 1);
		hashMap.put(3, 0);
		/**
		 * Calling the sort method and printing the sorted list of values of hash map.
		 */
		System.out.println(getValues(hashMap));
		

	}

}
