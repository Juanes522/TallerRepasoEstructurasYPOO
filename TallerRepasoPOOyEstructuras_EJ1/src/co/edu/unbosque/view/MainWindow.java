package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Represents the main window of the Staff Registration application. Extends
 * JFrame to create a GUI.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class MainWindow extends JFrame {

	/**
	 * Panel representing the background of the main window.
	 */
	private JPanel background;

	/**
	 * Panel containing the menu options.
	 */
	private MenuPanel menuPanel;

	/**
	 * Panel for registering new persons.
	 */
	private RegistrationPanel registrationPanel;

	/**
	 * Panel displaying the list of registered persons.
	 */
	private PersonListPanel personListPanel;

	/**
	 * Panel displaying the list of persons sorted by age.
	 */
	private ListSortByAgePanel listSortByAgePanel;

	/**
	 * Default constructor for the MainWindow class. Sets up the GUI with various panels.
	 */
	public MainWindow() {

		setTitle("Staff Registration");
		setBounds(0, 0, 400, 490);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		menuPanel = new MenuPanel();
		registrationPanel = new RegistrationPanel();
		personListPanel = new PersonListPanel();
		listSortByAgePanel = new ListSortByAgePanel();

		background = new JPanel();
		background.setLayout(null);
		background.setBackground(new Color(65, 90, 119));
		background.setBounds(0, 0, 400, 490);

		add(menuPanel);
		add(registrationPanel);
		add(personListPanel);
		add(listSortByAgePanel);
		add(background);

	}

	/**
	 * Gets the menu panel.
	 * 
	 * @return The MenuPanel instance.
	 */
	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	/**
	 * Sets the menu panel.
	 * 
	 * @param menuPanel The new MenuPanel instance.
	 */
	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	/**
	 * Gets the registration panel.
	 * 
	 * @return The RegistrationPanel instance.
	 */
	public RegistrationPanel getRegistrationPanel() {
		return registrationPanel;
	}

	/**
	 * Sets the registration panel.
	 * 
	 * @param registrationPanel The new RefistrationPanel instance.
	 */
	public void setRegistrationPanel(RegistrationPanel registrationPanel) {
		this.registrationPanel = registrationPanel;
	}

	/**
	 * Gets the person list panel.
	 * 
	 * @return The PersonListPanel instance.
	 */
	public PersonListPanel getPersonListPanel() {
		return personListPanel;
	}

	/**
	 * Sets the person list panel.
	 * 
	 * @param personListPanel The new PersonListPanel instance.
	 */
	public void setPersonListPanel(PersonListPanel personListPanel) {
		this.personListPanel = personListPanel;
	}

	/**
	 * Gets the list sort by age panel.
	 * 
	 * @return The ListSortByAgePanel instance.
	 */
	public ListSortByAgePanel getListSortByAgePanel() {
		return listSortByAgePanel;
	}

	/**
	 * Sets the list sort by age panel.
	 * 
	 * @param listSortByAgePanel The new ListSortByAgePanel instance.
	 */
	public void setListSortByAgePanel(ListSortByAgePanel listSortByAgePanel) {
		this.listSortByAgePanel = listSortByAgePanel;
	}

}
