package exceptionhandling;
/**
 * Desc: Validating the salary of employee whether it is above or equal to 3000 or not.
 * @author Aman Soni
 *
 */
import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class ValidateEmployeeSalaryAssignment {

	public static void main(String[] args) {
		/**
		 * Taking the salary of the employee from the user.
		 */
		System.out.print("Enter the salary of the employee: ");
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		input.close();
		/**
		 * Using try to check whether salary of the employee is 3000 or above.
		 */
		try {
			/**
			 * Checking if the salary is below 3000.
			 */
			if(salary<3000) {
				/**
				 * Throwing the user defined exception with appropriate message.
				 */
				throw new EmployeeException("Salary can't be below 3000");
			}
			else {
				/**
				 * Printing the appropriate message if the salary is validated successfully.
				 */
				System.out.println("Salary is validated successfully.");
			}
		}
		catch(EmployeeException e) {
			/**
			 * Printing the message in case the exception occur.
			 */
			System.out.println(e.getMessage());
		}

	}

}
