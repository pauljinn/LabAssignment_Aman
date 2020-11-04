import java.util.regex.Matcher;
import java.util.*;

public class SongPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SongPlayer songPlayer = new SongPlayer();
		//songPlayer.start();
		char choice;
		do {
			System.out.println("Enter a email address: ");
			Scanner in = new Scanner(System.in);
			String email = in.nextLine();
			if(email.matches("[a-zA-Z_][a-zA-Z]+@{1}[A-Za-z]+\\.{1}[A-Za-z]+")) {
				System.out.println("Valid Email");
			}
			else {
				System.out.println("Invalid Email");
			}
			System.out.println("Do you want to validate more email(Y/y): ");
			choice = in.next().charAt(0);
		}while(choice=='y' || choice=='Y');

	}

}
