/**
 * Desc : Finding the number of duplicate Employee object in the array of Employee objects.
 * @author Aman Soni
 *
 */

/**
 * Class for employees.
 * @author Aman Soni
 *
 */
class Employee{
	/**
	 * Attribute of employee like name and designation.
	 */
	private String name;
	private String designation;
	
	/**
	 * Initialize the employee with given name and designation.
	 * @param name of the employee.
	 * @param designation of the employee.
	 */
	public Employee(String name,String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	/**
	 * 
	 * @return the name of the employee.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return the designation of the employee.
	 */
	public String getDesignation() {
		return this.designation;
	}
	
	/**
	 * Overriding equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		/**
		 * Down casting Object to Employee.
		 */
		Employee employeeObject = (Employee) obj;
		/**
		 * Checking if the given object name, designation same as caller object.
		 * Returning true if it is same.
		 * Otherwise returning false.
		 */
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
		/**
		 * Creating several objects of Employee class.
		 */
		Employee firstEmployee = new Employee("Ramesh","Software Engineer");
		Employee secondEmployee = new Employee("Pankaj","Training");
		Employee thirdEmployee = new Employee("Dinesh","HR");
		Employee fourthEmployee = new Employee("Pankaj","Training");
		/**
		 * Creating the array of employee objects created earlier.
		 */
		Employee employeeArray[] = {firstEmployee,secondEmployee,thirdEmployee,fourthEmployee};
		/**
		 * Printing the number of duplicates for second Employee.
		 */
		System.out.println("Number of duplicates of second employee: "+findDuplicates(secondEmployee, employeeArray));
	}
	/**
	 * A method to find number of duplicate of a given Employee in the array of Employee objects.
	 * @param employee for which duplicate has to be checked.
	 * @param employeeArray an array in which duplicates employee has to be find using employee passed as parameter.
	 * @return the number of dupicate employee.
	 */
	public static int findDuplicates(Employee employee,Employee[] employeeArray) {
		/**
		 * A counter that kept the count of duplicate employee.
		 */
		int duplicateCount = -1;
		/**
		 * Loop to go through each employee inside the array.
		 */
		for(Employee emp:employeeArray) {
			/**
			 * Checking whether the current employee is duplicate with employee passed as parameter.
			 * If yes incrementing the count.
			 */
			if(emp.equals(employee)) {
				duplicateCount += 1;
			}
		}
		/**
		 * Returning the count of duplicate employee.
		 */
		return duplicateCount;
	}
}
