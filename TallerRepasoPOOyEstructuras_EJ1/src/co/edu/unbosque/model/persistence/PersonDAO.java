package co.edu.unbosque.model.persistence;

import co.edu.unbosque.controller.FileHandler;
import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.util.MyLinkedList;

/**
 * This class represents a Data Access Object as PersonDAO for managing
 * PersonDTO, it implements the OperationsDAO interface to provide operations
 * for creating, displaying and sorting person records.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */

public class PersonDAO implements OperationsDAO {

	/**
	 * A linked list containing the original list of person records.
	 */
	private MyLinkedList<PersonDTO> listPerson;

	/**
	 * A linked list used for sorting person records.
	 */
	private MyLinkedList<PersonDTO> copy;

	/**
	 * Default constructor for the PersonDAO class. Initializes the listPerson and
	 * copy linked list. Link both linked list with the file that contains the
	 * information.
	 */
	public PersonDAO() {
//		listPerson = new MyLinkedList<>();
//		copy = new MyLinkedList<>();

		listPerson = (MyLinkedList<PersonDTO>) FileHandler.readSerialized("people.txt");
		if(listPerson == null) {
			listPerson = new MyLinkedList<PersonDTO>();
		}
		copy = (MyLinkedList<PersonDTO>) FileHandler.readSerialized("people.txt");
		if(copy == null) {
			copy = new MyLinkedList<PersonDTO>();
		}

	}

	/**
	 * Gets the original list of person records.
	 * 
	 * @return The list of person records.
	 */
	public MyLinkedList<PersonDTO> getListPerson() {
		return listPerson;
	}

	/**
	 * Sets the original list of person records.
	 * 
	 * @param listPerson The new list of person records.
	 */
	public void setListPerson(MyLinkedList<PersonDTO> listPerson) {
		this.listPerson = listPerson;
	}

	/**
	 * Gets the linked list used for sorting person records.
	 * 
	 * @return The linked list for sorting person records.
	 */
	public MyLinkedList<PersonDTO> getCopy() {
		return copy;
	}

	/**
	 * Sets the linked list used for sorting person records.
	 * 
	 * @param copy The new linked list for sorting person records.
	 */
	public void setCopy(MyLinkedList<PersonDTO> copy) {
		this.copy = copy;
	}

	/**
	 * Writes the current state of listPerson and copy to a serialized file.
	 */
	public void writeFile() {
		FileHandler.writeSerialized("people.txt", listPerson);
		FileHandler.writeSerialized("people.txt", copy);
	}

	/**
	 * Creates a new person record in both listPerson and copy. If the person's id
	 * is less than 2, the record is added before the last element.
	 * 
	 * @param person The personDTO object representing the person to be created.
	 */
	@Override
	public void create(PersonDTO person) {

		if (person.getId() < 2) {
			listPerson.addBeforeLast(person);
			copy.addBeforeLast(person);
			writeFile();
		} else {
			listPerson.add(person);
			copy.add(person);
			writeFile();
		}

	}

	/**
	 * Returns a string representation of the original list of person records.
	 * 
	 * @return A string containing information about all the persons in the original
	 *         list.
	 */
	@Override
	public String show() {
		return listPerson.toString();
	}

	/**
	 * Returns a string representation of the sorted list of person records by age.
	 * 
	 * @return A string containing information about persons, sorted by age.
	 */
	@Override
	public String showAgeOrder() {

		for (int i = 0; i < copy.size(); i++) {

			for (int j = 0; j < copy.size() - 1; j++) {

				if (copy.get(j).getInfo().getDateOfBirth().getYear() < copy.get(j + 1).getInfo().getDateOfBirth()
						.getYear()) {

					PersonDTO aux = copy.get(j).getInfo();
					copy.get(j).setInfo(copy.get(j + 1).getInfo());
					copy.get(j + 1).setInfo(aux);

				}

			}

		}
		return copy.toString();
	}

}
