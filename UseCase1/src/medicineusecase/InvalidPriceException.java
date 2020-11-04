package medicineusecase;
/**
 * A user defined exception for invalid price.
 * @author Aman Soni
 *
 */
public class InvalidPriceException extends Exception{
	/**
	 * Initializing the user defined exception.
	 */
	public InvalidPriceException() {
		super();
	}
	public InvalidPriceException(String msg) {
		super(msg);
	}

}
