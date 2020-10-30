/**
 * Desc : Generating mirror image of the string and adding to original string by using '|' symbol.
 * @author Aman Soni
 *
 */
public class MirrorImageStringAssignment {
	
	public static void main(String[] args) {
		/**
		 * Calling getImage method to print the original string concatenated with it's mirror image using '|'
		 */
		System.out.println(getImage("EARTH"));

	}
	/**
	 * A method to generate mirror image of the given string.
	 * Add the mirror image to existing string using a pipe('|') symbol.
	 * Return the resultant string.
	 * @param inputString whose mirror image has to be found.
	 * @return mirror image of the given string concatenated with original string with '|'.
	 */
	public static String getImage(String inputString) {
		/**
		 * Creating a new StringBuffer object with inputString.
		 */
		StringBuffer inputStringBuffer = new StringBuffer(inputString);
		/**
		 * Calling reverse() of StringBuffer to find image of inputString.
		 */
		String image = inputStringBuffer.reverse().toString();
		/**
		 * Concatenating the mirror image with original string using '|'.
		 */
		String resultantString = inputString + "|" + image;
		/**
		 * Returning the resultant string.
		 */
		return resultantString;
	}

}
