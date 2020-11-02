package com.cg.eis.exception;
/**
 * A user defined exception thrown when the employee first name and last name is blank.
 * @author Aman Soni
 *
 */
public class NameException extends Exception{
	/**
	 * Initializing the EmployeeNameException without any message.
	 */
	public NameException() {
		super();
	}
	
	/**
	 * Initializing the EmployeeNameException with the passed message.
	 * @param message to be set to the new exception when created.
	 */
	public NameException(String message) {
		super(message);
	}

}
