/**
 * Desc : Simulating traffic light.
 * @author Aman Soni
 *
 */
import java.util.Scanner;

public class TrafficLightAssignment {

	public static void main(String[] args) {
		/**
		 * Asking the user to select a traffic light.
		 */
		System.out.println("Select the traffic light");
		System.out.println("1. Red");
		System.out.println("2. Green");
		System.out.println("3. Yellow");
		System.out.print("Enter your choice: ");
		/**
		 * Taking the user choice.
		 */
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		input.close();
		/**
		 * Printing the appropriate message based on the choice of the user.
		 */
		if(choice==1)
			System.out.println("Stop");
		else if(choice==2)
			System.out.println("Go");
		else if(choice==3)
			System.out.println("Ready");
		else
			System.out.println("Choose correct traffic light");
	}
}
