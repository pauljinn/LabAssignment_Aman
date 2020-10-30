/**
 * Desc : Counting the number of characters, words and lines in a text.
 * @author Aman Soni
 *
 */
public class TextAssignment {

	public static void main(String[] args) {
		/**
		 * Calling the appropriate method on the given string to calculate the number of character.s
		 * Number of line in the string.
		 * Number of words in the string.
		 */
		String text = "HEllo this is a text.\n This is the second line in the text.\nThis is the third line";
		System.out.println("Number of character in the text: " + countCharacters(text));
		System.out.println("Number of lines in the text: " + countLines(text));
		System.out.println("Number of words in the text: " + countWords(text));
	}
	/**
	 * A method to count number of characters in a text.
	 * @param text represent the original string.
	 * @return the number of characters present in a text.
	 */
	public static int countCharacters(String text) {
		int characterCount = 0;
		for(int i=0;i<text.length();i++) {
			if(Character.toLowerCase(text.charAt(i))>='a' && Character.toLowerCase(text.charAt(i))<='z') {
				characterCount += 1;
			}
		}
		return characterCount;
	}
	/**
	 * A method to count number of lines in a text.
	 * @param text represent the original string.
	 * @return the number of line after calculating.
	 */
	public static int countLines(String text) {
		/**
		 * A counter which kept the line count.
		 */
		int lineCount = 0;
		if(text.length()!=0) {
			lineCount += 1;
		}
		else {
			return 0;
		}
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='\n') {
				lineCount += 1;
			}
		}
		return lineCount;
	}
	/**
	 * Method to count number of words in a text.
	 * @param text represent the original string.
	 * @return number of words after calculating.
	 */
	public static int countWords(String text) {
		/**
		 * Splitting the original string at new line, . and space for finding the number of words.
		 */
		String[] wordArray = text.split("[\n. ]+");
		/**
		 * Return the length of the split array as that is number of words.
		 */
		return wordArray.length;
		
	}

}
