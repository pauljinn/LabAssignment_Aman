/**
 * Desc : Finding the number of duplicate Employee object in the array of Employee objects.
 * @author Aman Soni
 *
 */
/*
 * Class for employees.
 */
class Employee{
	
	private String name;
	private String designation;
	/*
	 * Parametrized Constructor of Employee class.
	 */
	public Employee(String name,String designation) {
		this.name = name;
		this.designation = designation;
	}
	/*
	 * Getters for Employee class.
	 */
	public String getName() {
		return this.name;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	/*
	 * Overriding equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		Employee employeeObject = (Employee) obj;
		if(this.getName().equals(employeeObject.getName()) & this.getDesignation().equals(employeeObject.getDesignation())) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class DuplicateEmployeeAssignment {

	public static void main(String[] args) {
		/*
		 * Creating several objects of Employee class.
		 */
		Employee firstEmployee = new Employee("Ramesh","Software Engineer");
		Employee secondEmployee = new Employee("Pankaj","Training");
		Employee thirdEmployee = new Employee("Dinesh","HR");
		Employee fourthEmployee = new Employee("Pankaj","Training");
		/*
		 * Creating the array of employee objects created earlier.
		 */
		Employee employeeArray[] = {firstEmployee,secondEmployee,thirdEmployee,fourthEmployee};
		/*
		 * Printing the number of duplicates for second Employee.
		 */
		System.out.println("Number of duplicates of second employee: "+findDuplicates(secondEmployee, employeeArray));
	}
	/*
	 * A method to find number of duplicate of a given Employee in the array of Employee objects.
	 */
	public static int findDuplicates(Employee employee,Employee[] employeeArray) {
		int duplicateCount = -1;
		for(Employee emp:employeeArray) {
			if(emp.equals(employee)) {
				duplicateCount += 1;
			}
		}
		return duplicateCount;
	}
	

}
