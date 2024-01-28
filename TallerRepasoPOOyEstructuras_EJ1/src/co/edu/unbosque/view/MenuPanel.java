package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Represents a JPanel for displaying the main menu of the Staff Registration application.
 * Extends JPanel to create GUI.
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class MenuPanel extends JPanel {

	/**
	 * JButton for navigating to the staff registration panel.
	 */
	private JButton registrationButton; 
	
	/**
	 * JButton for navigating to the staff list panel.
	 */
	private JButton listButton; 
	
	/**
	 * JButton for navigating to the staff age order panel.
	 */
	private JButton listSortButton;
	
	/**
	 * JLabel displaying the title of the menu panel.
	 */
	private JLabel title;

	/**
	 * Default constructor for the MenuPanel class.
	 * Sets up the GUI with various components.
	 */
	public MenuPanel() {

		setBounds(0, 0, 400, 490);
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		title = new JLabel("Staff Registration");
		title.setBounds(59, 40, 280, 30);
		title.setFont(new Font("Consolas", Font.BOLD, 27));
		title.setForeground(Color.WHITE);
		title.setFocusable(false);
		add(title);

		registrationButton = new JButton("Register Staff");
		registrationButton.setBounds(70, 110, 250, 50);
		registrationButton.setFont(new Font("Consolas", Font.BOLD, 20));
		registrationButton.setForeground(Color.WHITE);
		registrationButton.setBackground(new Color(27, 38, 59));
		registrationButton.setFocusable(false);
		registrationButton.setBorderPainted(false);
		add(registrationButton);

		listButton = new JButton("Staff List");
		listButton.setBounds(70, 210, 250, 50);
		listButton.setFont(new Font("Consolas", Font.BOLD, 20));
		listButton.setForeground(Color.WHITE);
		listButton.setBackground(new Color(27, 38, 59));
		listButton.setFocusable(false);
		listButton.setBorderPainted(false);
		add(listButton);

		listSortButton = new JButton("Staff Age Order");
		listSortButton.setBounds(70, 310, 250, 50);
		listSortButton.setFont(new Font("Consolas", Font.BOLD, 20));
		listSortButton.setForeground(Color.WHITE);
		listSortButton.setBackground(new Color(27, 38, 59));
		listSortButton.setFocusable(false);
		listSortButton.setBorderPainted(false);
		add(listSortButton);

	}

	/**
	 * Gets the JButton for navigating to the staff registration panel.
	 * @return The JButton instance.
	 */
	public JButton getRegistrationButton() {
		return registrationButton;
	}

	/**
	 * Sets the JButton for navigating to the staff registration panel.
	 * @param registrationButton The new JButton instance.
	 */
	public void setRegistrationButton(JButton registrationButton) {
		this.registrationButton = registrationButton;
	}

	/**
	 * Gets the JButton for navigating to the staff list panel.
	 * @return The JButton instance.
	 */
	public JButton getListButton() {
		return listButton;
	}

	/**
	 * Sets the JButton for navigating to the staff list panel.
	 * @param listButton The new JButton instance.
	 */
	public void setListButton(JButton listButton) {
		this.listButton = listButton;
	}

	/**
	 * Gets the JButton for navigating to the staff age order panel.
	 * @return The JButton instance.
	 */
	public JButton getListSortButton() {
		return listSortButton;
	}
	
	/**
	 * Sets the JButton for navigating to the staff age order panel.
	 * @param listSortButton The new JButton instance.
	 */
	public void setListSortButton(JButton listSortButton) {
		this.listSortButton = listSortButton;
	}

}
