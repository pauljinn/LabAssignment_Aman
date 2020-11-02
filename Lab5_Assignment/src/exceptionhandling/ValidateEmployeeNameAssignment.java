package exceptionhandling;

/**
 * Desc: Validating the full name of the employee, if the first name and last name is blank then throwing the appropriate exception.
 * @author Aman Soni
 *
 */
import java.util.Scanner;
import com.cg.eis.exception.NameException;

public class ValidateEmployeeNameAssignment {

	public static void main(String[] args) {
		/**
		 * A try block for validating the name of the employee entered by the user.
		 */
		try {
			/**
			 * Taking the employee first name from the user.
			 */
			System.out.print("Enter the first name of the employee: ");
			Scanner input = new Scanner(System.in);
			String employeeFirstName = input.nextLine();
			/**
			 * Checking if the first name is blank.
			 */
			if(employeeFirstName.isBlank()) {
				/**
				 * If first name is blank then throwing user defined exception with appropriate message.
				 */
				throw new NameException("First name can't be blank");
			}
			/**
			 * After validating the first name if there is no problem then taking the last name of the employee.
			 */
			else {
				/**
				 * Taking the last name of the employee.
				 */
				System.out.print("Enter the last name of the employee: ");
				String employeeLastName = input.nextLine();
				/**
				 * Checking if the last name is blank.
				 */
				if(employeeLastName.isBlank()) {
					/**
					 * If last name is blank then throwing user defined exception with appropriate message.
					 */
					throw new NameException("Last name can't be blank");
				}
			}
			input.close();
		}
		/**
		 * Catching the exception thrown by try block.
		 */
		catch(NameException e) {
			/**
			 * Printing the appropriate message inside the exception.
			 */
			System.out.println(e.getMessage());
		}

	}

}
