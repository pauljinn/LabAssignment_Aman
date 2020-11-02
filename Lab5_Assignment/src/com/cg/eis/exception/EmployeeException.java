package com.cg.eis.exception;
/**
 * A user defined exception class.
 * @author Aman Soni
 *
 */
public class EmployeeException extends Exception{
	/**
	 * For initializing the user defined exception without any message.
	 */
	public EmployeeException() {
		super();
	}
	
	/**
	 * For initializing the user defined exception with given message.
	 * @param message for initializing the user defined exception.
	 */
	public EmployeeException(String message) {
		super(message);
	}

}
