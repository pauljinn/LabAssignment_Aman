package exercises;

import java.util.*;

/**
 * Desc: Counting the number of times a character occur in an array.
 * Returning the map of it with key as character and values as no of time that character occur.
 * @author Aman Soni
 *
 */
public class CountCharacterAssignment {
	
	/**
	 * Method to count the occurrence of each character in array.
	 * @param arr a character array.
	 * @return the map having character as key and it's occurrence as value.
	 */
	public static Map<Character,Integer> countChars(char[] arr){
		/**
		 * A map to kept the character and it's occurence in the array.
		 */
		Map<Character,Integer> characterOccurence = new HashMap<>();
		/**
		 * Looping through each character in the array.
		 */
		for(char c: arr) {
			/**
			 * Checking if the character is already present as key in map.
			 */
			if(characterOccurence.containsKey(c)) {
				/**
				 * If present then just incrementing the value at that character key.
				 */
				characterOccurence.put(c, characterOccurence.get(c)+1);
			}
			/**
			 * If character is not present as key inside the map.
			 */
			else {
				/**
				 * Adding as new key and putting value as 1 because that character occur one time.
				 */
				characterOccurence.put(c, 1);
			}
		}
		return characterOccurence;
	}
	public static void main(String[] args) {
		/**
		 * A character array.
		 */
		char[] characters = {'a','b','a','c','c','b','a','d'};
		/**
		 * Calling countChars method to count occurrence of each character in array.
		 * Printing the returned map.
		 */
		System.out.println(countChars(characters));

	}

}
