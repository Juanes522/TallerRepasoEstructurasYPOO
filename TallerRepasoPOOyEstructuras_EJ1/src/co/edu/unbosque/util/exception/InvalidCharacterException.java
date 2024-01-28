package co.edu.unbosque.util.exception;

/**
 * Exception class representing an exception when an invalid character is
 * encountered. This exception show an error message when validating input
 * strings.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class InvalidCharacterException extends Exception {

	/**
	 * Default constructor for the InvalidCharacterException class. Constructs the
	 * exception with a default error message.
	 */
	public InvalidCharacterException() {
		super("Invalid character");
	}

}
