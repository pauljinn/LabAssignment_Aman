import java.util.Arrays;

/**
 * Desc : Replacing the consonants in the string with the next alphabet.
 * @author Aman Soni
 *
 */
public class ReplaceConsonantAssignment {

	public static void main(String[] args) {
		/**
		 * Printing the new string for given word.
		 */
		System.out.println(alterString("JAVA"));

	}
	/**
	 * A method method which accepts a String.
	 * Replaces all the consonants in the String with the next alphabet. 
	 * @param originalString in which consonants has to be replaced with next alphabet.
	 * @return the altered string.
	 */
	public static String alterString(String originalString) {
		/**
		 * Initializing the vowel string with all the vowels.
		 */
		final String VOWELS = "aeiou";
		/**
		 * Store the altered string having next alphabet in place of consonant.
		 */
		String alteredString = "";
		/**
		 * Running loop through each letter of string.
		 */
		for(int i=0;i<originalString.length();i++) {
			/**
			 * Checking if the letter is not a vowel.
			 */
			if(!VOWELS.contains(Character.toString(originalString.charAt(i)).toLowerCase())) {
				/**
				 * Replacing the letter with next alphabet.
				 */
				alteredString += (char)(originalString.charAt(i)+1);
			}
			/**
			 * If it's a vowel then simply concatenating it in the altered string.
			 */
			else {
				alteredString += originalString.charAt(i);
			}
		}
		return alteredString;
	}
}
