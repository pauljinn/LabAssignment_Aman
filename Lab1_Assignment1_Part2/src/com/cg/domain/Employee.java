package com.cg.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * An employee POJO to store the details of the employee.
 * @author Aman Soni
 *
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	private SBU businessUnit;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int employeeId, String employeeName, double salary, SBU businessUnit) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
	}
	@Autowired
	public Employee(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}
	
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + "]";
	}

	
	
	

}
