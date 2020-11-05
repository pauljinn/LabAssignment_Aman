package com.cg.eis.bean;

/**
 * Creates a new employee.
 * @author Aman Soni
 *
 */
public class Employee {
	
	private long id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	
	/**
	 * Creating a new employee.
	 * @param name of the employee.
	 * @param salary of the employee.
	 * @param designation of the employee.
	 */
	public Employee(long id,String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	/**
	 * 
	 * @return the id of the employee.
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Set the id of the employee.
	 * @param id of the employee.
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the name of the employee.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the employee.
	 * @param name of the employee.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the salary of the employee.
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Set the salary of the employee.
	 * @param salary of employee.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * @return designation of the employee.
	 */
	public String getDesignation() {
		return designation;
	}
	
	/**
	 * Set the designation of the employee.
	 * @param designation, of the employee.
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	/**
	 * @return insurance scheme for an employee.
	 */
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	
	/**
	 * Set the insurance scheme for an employee.
	 * @param insuranceScheme
	 */
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
}
