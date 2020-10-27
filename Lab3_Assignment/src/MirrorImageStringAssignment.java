/**
 * Desc : Generating mirror image of the string and adding to original string by using '|' symbol.
 * @author Aman Soni
 *
 */
public class MirrorImageStringAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getImage("EARTH"));

	}
	/*
	 * A method to generate mirror image of the given string.
	 * Add the mirror image to existing string using a pipe('|') symbol.
	 * Return the resultant string.
	 */
	public static String getImage(String inputString) {
		StringBuffer inputStringBuffer = new StringBuffer(inputString);
		String image = inputStringBuffer.reverse().toString();
		String resultantString = inputString + "|" + image;
		return resultantString;
	}

}
