package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

/**
 * Interact with user and service layer.
 * @author Aman Soni
 *
 */
public class Driver {
	/**
	 * Show the services provided to employee.
	 */
	public static void showServiceMenu() {
		System.out.println("**********Welcome to employee services***********");
		System.out.println("1. Add an employee");
		System.out.println("2. Display employee details based on insurance scheme");
		System.out.println("3. Delete an employee");
		System.out.println("4.Exit");
	}
	
	/**
	 * Takes the details of the employee like name, salary and designation.
	 * @param in a scanner object to take input.
	 * @return the new employee.
	 */
	public static Employee takeDetails(Scanner in) {
		
		System.out.print("Enter the id of the employee: ");
		long id = in.nextLong();
		in.nextLine();
		System.out.print("Enter the employee name: ");
		String name = in.nextLine();
		System.out.print("Enter the employee salary: ");
		Double salary = in.nextDouble();
		in.nextLine();
		System.out.print("Enter the employee designation: ");
		String designation  = in.nextLine();
		Employee emp = new Employee(id,name,salary,designation);
		return emp;
		
	}
	public static void main(String[] args) {
		/**
		 * Creating a new service for employee's.
		 */
		EmployeeService empService = new EmployeeService();
		/**
		 * kept the user choice.
		 */
		Scanner input = new Scanner(System.in);
		int choice=0;
		do {
			/**
			 * Showing employee service menu.
			 */
			showServiceMenu(); 
			/**
			 * Taking user choice.
			 */
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			input.nextLine();
			/**
			 * Providing various service based on user choice.
			 */
			switch(choice) {
			/**
			 * Add employee service.
			 */
			case 1:
				/**
				 * Taking the details of the employee to add.
				 */
				Employee emp = takeDetails(input);
				/**
				 * Finding insurance scheme for this employee.
				 */
				String insuranceScheme = empService.findInsuranceScheme(emp);
				/**
				 * Setting the insurance scheme.
				 */
				emp.setInsuranceScheme(insuranceScheme);
				/**
				 * Adding the employee.
				 */
				empService.addEmployee(emp);
				break;
			/**
			 * Display employee details based on insurance scheme service.
			 */
			case 2:
				/**
				 * Taking the insurance scheme of an employee from user.
				 */
				System.out.println("Enter the insurance scheme: ");
				String scheme = input.nextLine();
				/**
				 * Displaying employee details based on insurance scheme.
				 */
				empService.displayEmployeeDetails(scheme);
				break;
			/**
			 * Employee delete service.
			 */
			case 3:
				/**
				 * Taking the id of the employee to delete.
				 */
				System.out.println("Enter the id of the employee: ");
				long employeeId = input.nextLong();
				input.nextLine();
				/**
				 * Deleting the employee if present.
				 */
				if(empService.deleteEmployee(employeeId)) {
					System.out.println("Employee successfully deleted");
				}
				/**
				 * Appropriate message will be shown if employee is not present.
				 */
				else {
					System.out.println("Employee not present with given id");
				}
				break;
			}
		}while(choice!=4);
		input.close();
	}

}
