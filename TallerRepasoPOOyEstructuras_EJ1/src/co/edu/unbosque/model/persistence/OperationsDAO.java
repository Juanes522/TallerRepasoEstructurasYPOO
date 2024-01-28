package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PersonDTO;

/**
 * This interface defines operations for interacting with data access object as
 * OperationsDAO, it manages information for different class in this case
 * person.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public interface OperationsDAO {

	/**
	 * Creates a new person record in the data storage
	 * 
	 * @param person The personDTO object representing the person to be created.
	 */
	public void create(PersonDTO person);

	/**
	 * Retrieves a string representation of all person records.
	 * 
	 * @return A string containing information about all persons in the data
	 *         storage.
	 */
	public String show();

	/**
	 * Retrieves a string representation of person records sorted by age.
	 * 
	 * @return A string containing information about persons, sorted by age.
	 */
	public String showAgeOrder();

}
