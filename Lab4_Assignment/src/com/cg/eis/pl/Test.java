/**
 * Desc: Getting the input from user, produce expected output to the user and invoke services offered by the system. 
 * @author Aman Soni
 *
 */
package com.cg.eis.pl;

/**
 * Importing the necessary package for Employee and Service class.
 */
import com.cg.eis.service.Service;
import java.util.ServiceConfigurationError;
import com.cg.eis.bean.Employee;

public class Test {

	public static void main(String[] args) {
		/**
		 * Creating the new Service.
		 */
		Service service = new Service();
		/**
		 * Invoking various services for new Employee.
		 * Getting the new employee details.
		 * Finding the appropriate insurance scheme for an employee.
		 * Displaying the necessary details.
		 */
		Employee newEmployee =  service.getEmployeeDetails();
		String insuranceScheme = service.findInsuranceScheme(newEmployee);
		newEmployee.setInsuranceScheme(insuranceScheme);
		service.displayDetails(newEmployee);
	}

}
