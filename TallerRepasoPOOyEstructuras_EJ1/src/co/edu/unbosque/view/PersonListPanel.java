package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * Represents a JPanel for displaying the list of staff members. Extends JPanel
 * to create GUI instance.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class PersonListPanel extends JPanel {

	/**
	 * JLabel displaying the title of the staff list panel.
	 */
	private JLabel titleList;

	/**
	 * JTextArea for displaying the list of staff members.
	 */
	private JTextArea listPerson;

	/**
	 * JScrollPane for adding scrolling functionality to the listPerson JTextArea.
	 */
	private JScrollPane bar;

	/**
	 * JButton for navigating back to the main menu.
	 */
	private JButton listBack;

	/**
	 * Default constructor for the PersonListPanel class. Sets up the GUI with
	 * various components.
	 */
	public PersonListPanel() {

		setBounds(0, 0, 400, 490);
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		titleList = new JLabel("Staff List");
		titleList.setBounds(118, 40, 280, 30);
		titleList.setFont(new Font("Consolas", Font.BOLD, 27));
		titleList.setForeground(Color.WHITE);
		titleList.setFocusable(false);
		add(titleList);

		listPerson = new JTextArea();
		listPerson.setBounds(50, 110, 285, 285);
		listPerson.setBackground(new Color(224, 225, 221));
		listPerson.setFocusable(false);
		listPerson.setFont(new Font("Consolas", Font.BOLD, 17));
		add(listPerson);

		bar = new JScrollPane();
		bar.setViewportView(listPerson);
		bar.setBounds(50, 110, 285, 285);
		add(bar);

		listBack = new JButton("\u2190");
		listBack.setBounds(0, 0, 50, 48);
		listBack.setFont(new Font("Consolas", Font.BOLD, 26));
		listBack.setVerticalAlignment(SwingConstants.CENTER);
		listBack.setForeground(Color.WHITE);
		listBack.setBackground(new Color(27, 38, 59));
		listBack.setFocusable(false);
		listBack.setBorderPainted(false);
		add(listBack);

	}

	/**
	 * Gets the JTextArea displaying the list of staff members.
	 * 
	 * @return the JTextArea instance.
	 */
	public JTextArea getListPerson() {
		return listPerson;
	}

	/**
	 * Sets the JTextArea displaying the list of staff members.
	 * 
	 * @param listPerson The new JTextArea instance.
	 */
	public void setListPerson(JTextArea listPerson) {
		this.listPerson = listPerson;
	}

	/**
	 * Gets the JButton for navigating back to the main menu.
	 * 
	 * @return The JButton instance.
	 */
	public JButton getListBack() {
		return listBack;
	}

	/**
	 * Sets the JButton for navigating back to the main menu.
	 * 
	 * @param listBack The new JButton instance.
	 */
	public void setListBack(JButton listBack) {
		this.listBack = listBack;
	}

}
