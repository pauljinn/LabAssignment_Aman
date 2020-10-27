/**
 * Desc : Fetching the command from a URL.
 * @author Aman Soni
 *
 */
public class CommandAssignment {

	public static void main(String[] args){
		System.out.println(fetchCommand("https://sample//html.com"));
	}
	/*
	 * A method which accepts a URL string.
	 * Return the command.
	 */
	public static String fetchCommand(String url) {
		String[] splittedUrl = url.split("[/.]+");
		for(String i:splittedUrl)
			System.out.println(i);
		return splittedUrl[splittedUrl.length-2];
	}

}
