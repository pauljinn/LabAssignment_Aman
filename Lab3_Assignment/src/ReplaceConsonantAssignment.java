import java.util.Arrays;

/**
 * Desc : Replacing the consonants in the string with the next alphabet.
 * @author Aman Soni
 *
 */
public class ReplaceConsonantAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alterString("JAVA"));

	}
	/*
	 * A method method which accepts a String.
	 * Replaces all the consonants in the String with the next alphabet. 
	 * Return the altered string.
	 */
	public static String alterString(String originalString) {
		final String VOWELS = "aeiou";
		String alteredString = "";
		for(int i=0;i<originalString.length();i++) {
			if(!VOWELS.contains(Character.toString(originalString.charAt(i)).toLowerCase())) {
				alteredString += (char)(originalString.charAt(i)+1);
			}
			else {
				alteredString += originalString.charAt(i);
			}
		}
		return alteredString;
	}
}
