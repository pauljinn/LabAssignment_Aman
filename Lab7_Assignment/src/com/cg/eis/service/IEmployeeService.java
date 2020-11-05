package com.cg.eis.service;

import com.cg.eis.bean.Employee;

/**
 * Maintains all the services provided to an employee.
 * @author Aman Soni
 *
 */
public interface IEmployeeService {
	/**
	 * Adds an employee in local repository.
	 * @param emp
	 */
	public void addEmployee(Employee emp);
	/**
	 * Find the insurance scheme for an employee.
	 * @param emp an employee object.
	 * @return the appropriate insurance scheme based on employee salary and designation.
	 */
	public String findInsuranceScheme(Employee emp);
	/**
	 * Display all the employee details whose insurance scheme as provided.
	 * @param insuranceScheme
	 */
	public void displayEmployeeDetails(String insuranceScheme);
	
	/**
	 * Delete an employee from the local repository based on employee id.
	 * @param employeeId
	 * @return
	 */
	public boolean deleteEmployee(long employeeId);
}
