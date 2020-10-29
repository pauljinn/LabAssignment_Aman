package com.cg.eis.service;

/**
 * 
 * Importing the necessary package.
 */
import java.util.Scanner;
import com.cg.eis.bean.Employee;

/**
 * Desc: Service class to offer various serivices to employee.
 * @author Aman Soni
 *
 */
public class Service implements EmployeeService{
	/**
	 * A method to take all the employee details like id, name, designation and salary.
	 * @return new Employee.
	 */
	@Override
	public Employee getEmployeeDetails() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the employee id: ");
		int id = in.nextInt();
		/**
		 * Consuming the empty line which is not consumed by nextInt() to take next input.
		 */
		in.nextLine();
		System.out.print("Enter the employee name: ");
		String name = in.nextLine();
		System.out.print("Enter the employee salary: ");
		double salary = in.nextDouble();
		in.nextLine();
		System.out.print("Enter the designation of employee: ");
		String designation = in.nextLine();
		in.close();
		/**
		 * Creating an Employee for the details provided by the user.
		 */
		Employee employee = new Employee(id,name,salary,designation);
		/**
		 * Returning the new Employee.
		 */
		return employee;
	}
	/**
	 * A method to find insurance scheme for an employee based on their salary and designation.
	 * @param emp an Employee class instance for which insurance scheme has to find.
	 * @return the insurance scheme.
	 */
	@Override
	public String findInsuranceScheme(Employee emp) {
		if(emp.getSalary()>0 && emp.getSalary()<=10000 && emp.getDesignation().equalsIgnoreCase("Analyst")) {
			return "Premium";
		}
		else if(emp.getSalary()>10000 && emp.getDesignation().equalsIgnoreCase("Consultant")) {
			return "Gold";
		}
		else
			return "Normal";
	}
	/**
	 * A method to display the details of an employee.
	 * @param emp an Employee class instance for which details has to be displayed.
	 */
	public void displayDetails(Employee emp) {
		System.out.println("***********Employee Details***********");
		System.out.println("ID: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Designation: "+emp.getDesignation());
		System.out.println("Loan Scheme: "+emp.getInsuranceScheme());
		
	}
}
