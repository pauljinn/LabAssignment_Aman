/**
 * Desc : Fetching the command from a URL.
 * @author Aman Soni
 *
 */
public class CommandAssignment {

	public static void main(String[] args){
		/**
		 * Fetching the command from the given URL and printing it on the console.
		 */
		System.out.println(fetchCommand("https://sample//html.com"));
	}
	/**
	 * A method which accepts a URL string.
	 * Return the command.
	 * @param url from which command has to be fetched.
	 * @return the fetched command.
	 */
	public static String fetchCommand(String url) {
		/**
		 * Splitting the URL on 1 or more '/','.' using split method of String api.
		 * Keeping the resultant array in splittedUrl.
		 */
		String[] splittedUrl = url.split("[/.]+");
		/**
		 * The second list index of the array splittedUrl will always have the command so returning it.
		 */
		return splittedUrl[splittedUrl.length-2];
	}

}
