package com.cg.eis.exception;
/**
 * User defined exception.
 * @author Aman Soni
 *
 */
public class AgeException extends Exception {
	/**
	 * Initialize the age exception without any message.
	 */
	public AgeException() {
		/**
		 * Calling the parent class default constructor.
		 */
		super();
	}
	
	/**
	 * Initialize the age exception with message.
	 * @param msg with which exception has to be initialized.
	 */
	public AgeException(String msg) {
		/**
		 * Calling the parent class parametrized constructor with provided msg.
		 */
		super(msg);
	}

}
