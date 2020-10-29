package com.cg.eis.service;
/**
 * Importing the Employee class.
 */
import com.cg.eis.bean.Employee;

/**
 * Desc: An interface to hold the basic services that must be provided to all employees.
 * @author Aman Soni
 */
public interface EmployeeService {
	Employee getEmployeeDetails();
	String findInsuranceScheme(Employee emp);
	void displayDetails(Employee emp);

}
