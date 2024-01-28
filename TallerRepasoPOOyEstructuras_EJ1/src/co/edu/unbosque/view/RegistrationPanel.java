package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Represents a JPanel for staff registration. Extends JPanel to create a GUI.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class RegistrationPanel extends JPanel {

	/**
	 * JLabel displaying the title of the registration panel.
	 */
	private JLabel registrationTitle;

	/**
	 * JLabels indicating to the "Name" field.
	 */
	private JLabel indName;

	/**
	 * JLabel indicating the "Date of birth" field.
	 */
	private JLabel indDate;

	/**
	 * JTextField for entering the staff member's name.
	 */
	private JTextField personName;

	/**
	 * JTextField for entering the staff member's date of birth.
	 */
	private JTextField date;

	/**
	 * JButton for navigating back to the main menu.
	 */
	private JButton registerBack;

	/**
	 * JButton for confirming the staff member registration.
	 */
	private JButton confirm;

	/**
	 * Default constructor for the RegistrationPanel class. Sets up the GUI with
	 * various components.
	 */
	public RegistrationPanel() {

		setBounds(0, 0, 400, 490);
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		registrationTitle = new JLabel("Register Staff");
		registrationTitle.setBounds(89, 60, 280, 30);
		registrationTitle.setFont(new Font("Consolas", Font.BOLD, 27));
		registrationTitle.setForeground(Color.WHITE);
		registrationTitle.setFocusable(false);
		add(registrationTitle);

		indName = new JLabel("Name:");
		indName.setBounds(80, 125, 150, 30);
		indName.setFont(new Font("Consolas", Font.BOLD, 20));
		indName.setForeground(Color.WHITE);
		indName.setFocusable(false);
		add(indName);

		personName = new JTextField();
		personName.setBounds(80, 160, 230, 26);
		personName.setBorder(null);
		personName.setFont(new Font("Consolas", Font.BOLD, 20));
		add(personName);

		indDate = new JLabel("<html>Date of birth:<br>using: (yyyy/MM/dd)</html>");
		indDate.setBounds(80, 220, 250, 50);
		indDate.setFont(new Font("Consolas", Font.BOLD, 20));
		indDate.setForeground(Color.WHITE);
		indDate.setFocusable(false);
		add(indDate);

		date = new JFormattedTextField();
		date.setBounds(80, 280, 230, 26);
		date.setBorder(null);
		date.setFont(new Font("Consolas", Font.BOLD, 20));
		add(date);

		registerBack = new JButton("\u2190");
		registerBack.setBounds(0, 0, 50, 48);
		registerBack.setFont(new Font("Consolas", Font.BOLD, 26));
		registerBack.setVerticalAlignment(SwingConstants.CENTER);
		registerBack.setForeground(Color.WHITE);
		registerBack.setBackground(new Color(27, 38, 59));
		registerBack.setFocusable(false);
		registerBack.setBorderPainted(false);
		add(registerBack);

		confirm = new JButton("Confirm");
		confirm.setBounds(120, 350, 150, 40);
		confirm.setFont(new Font("Consolas", Font.BOLD, 20));
		confirm.setForeground(Color.WHITE);
		confirm.setBackground(new Color(27, 38, 59));
		confirm.setFocusable(false);
		confirm.setBorderPainted(false);
		add(confirm);

	}

	/**
	 * Gets the JTextField for entering the staff member's name.
	 * 
	 * @return The JTextField instance.
	 */
	public JTextField getPersonName() {
		return personName;
	}

	/**
	 * Sets the JTextField for entering the staff member's name.
	 * 
	 * @param personName The new JTextField instance.
	 */
	public void setPersonName(JTextField personName) {
		this.personName = personName;
	}

	/**
	 * Gets the JTextField for entering the staff member's date of birth.
	 * 
	 * @return The JTextField instance.
	 */
	public JTextField getDate() {
		return date;
	}

	/**
	 * Sets the JTextField for entering the staff member's date of birth.
	 * 
	 * @param date The new JTextField instance.
	 */
	public void setDate(JTextField date) {
		this.date = date;
	}

	/**
	 * Gets the JButton for navigating back to the main menu.
	 * 
	 * @return The JButton instance.
	 */
	public JButton getRegisterBack() {
		return registerBack;
	}

	/**
	 * Sets the JButton for navigating back to the main menu.
	 * 
	 * @param registerBack The new JButton instance.
	 */
	public void setRegisterBack(JButton registerBack) {
		this.registerBack = registerBack;
	}

	/**
	 * Gets the JButton for confirming the staff member registration.
	 * 
	 * @return The JButton instance.
	 */
	public JButton getConfirm() {
		return confirm;
	}

	/**
	 * Sets the JButton for confirming the staff member registration.
	 * 
	 * @param confirm The new JButton instance.
	 */
	public void setConfirm(JButton confirm) {
		this.confirm = confirm;
	}

}
