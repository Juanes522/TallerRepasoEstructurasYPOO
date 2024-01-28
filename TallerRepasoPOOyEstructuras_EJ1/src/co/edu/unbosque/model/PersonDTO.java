package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Represents a person's data transfer object as PersonDTO. This class is used
 * to encapsulate information about a person, with their name, date of birth and
 * id as a identifier.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class PersonDTO implements Serializable {

	/**
	 * Unique identifier for serialization.
	 */
	private static final long serialVersionUID = 5187393024040906432L;
	/**
	 * The name of the person.
	 */
	private String name;
	/**
	 * The date of birth of the person.
	 */
	private LocalDate dateOfBirth;
	/**
	 * The identifier of the person.
	 */
	private int id;

	/**
	 * Default constructor for the PersonDTO class.
	 */
	public PersonDTO() {
	}

	/**
	 * Creates a new instance of the PersonDTO class with the specified attributes.
	 * 
	 * @param name        The name of the person.
	 * @param dateOfBirth The date of birth of the person.
	 * @param id          The identifier of the person.
	 */
	public PersonDTO(String name, LocalDate dateOfBirth, int id) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
	}

	/**
	 * Gets the name of the person.
	 * 
	 * @return The name of the person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the person.
	 * 
	 * @param name The new name for the person.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the date of birth of the person.
	 * 
	 * @return The date of birth of the person.
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the date of birth of the person.
	 * 
	 * @param dateOfBirth The new date of birth for the person.
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Gets the if of the person.
	 * 
	 * @return The id of the person.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the identifier of the person.
	 * 
	 * @param id The new id for the person.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns a string representation of the person's information.
	 * 
	 * @return A string containing the name, date of birth, and id of a person.
	 */
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + getName());
		sb.append("\nDate of birth: " + getDateOfBirth() + "\n");
		sb.append("id: " + getId() + "\n");

		return sb.toString();
	}

}
