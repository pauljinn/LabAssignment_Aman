package com.cg.eis.bean;

/**
 * Desc: Employee class to hold employee id, name, salary, designation and loan scheme.
 * @author Aman Soni
 *
 */
public class Employee {
	/**
	 * Attributes of employee.
	 */
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	/**
	 * Parameterized constructor.
	 * @param id for employee id.
	 * @param name for employee name.
	 * @param salary for employee salary.
	 * @param designation for employee designation.
	 */
	public Employee(int id,String name,double salary,String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	/**
	 * Setter to set the loan scheme of an employee.
	 * @param loanScheme
	 */
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	/**
	 * Getter.
	 * @return the loan scheme.
	 */
	public String getInsuranceScheme() {
		return this.insuranceScheme;
	}
	
	/**
	 * Getter.
	 * @return the id of an employee.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Getter.
	 * @return the name of an employee.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Getter.
	 * @return the salary of an employee.
	 */
	public double getSalary() {
		return this.salary;
	}
	
	/**
	 * Getter.
	 * @return the designation of an employee.
	 */
	public String getDesignation() {
		return this.designation;
	}
}
