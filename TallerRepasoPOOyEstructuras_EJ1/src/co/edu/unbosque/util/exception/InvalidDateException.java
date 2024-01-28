package co.edu.unbosque.util.exception;

/**
 * Exception class representing an exception when an invalid date format is
 * encountered. This exception is show an error when validating date strings.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class InvalidDateException extends Exception {

	/**
	 * Default constructor for the InvalidDateException class. Constructs the
	 * exception with a default error message.
	 */
	public InvalidDateException() {
		super("invalid date");
	}

}
