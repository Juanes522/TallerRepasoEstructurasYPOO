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
 * Represents a JPanel for displaying a sorted list of persons by date of birth.
 * Extends JPanel to create a GUI.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */
public class ListSortByAgePanel extends JPanel {

	/**
	 * JLabel displaying the title of the sorted list panel
	 */
	private JLabel titleSortList;

	/**
	 * JTextArea for displaying the sorted list of persons.
	 */
	private JTextArea listSort;

	/**
	 * JScrollPane for adding scrolling functionality to the listSort in the
	 * JTextArea
	 */
	private JScrollPane barSort;

	/**
	 * JButton for navigating back to the main menu.
	 */
	private JButton listSortBack;

	/**
	 * Default constructor for the ListSortedByAgePanel class. Sets up the GUI with various components.
	 */
	public ListSortByAgePanel() {

		setBounds(0, 0, 400, 490);
		setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		titleSortList = new JLabel("<html><center>List by <br> date of birth </center></html>");
		titleSortList.setBounds(98, 30, 280, 60);
		titleSortList.setFont(new Font("Consolas", Font.BOLD, 27));
		titleSortList.setForeground(Color.WHITE);
		titleSortList.setFocusable(false);
		add(titleSortList);

		listSort = new JTextArea();
		listSort.setBounds(50, 110, 285, 285);
		listSort.setBackground(new Color(224, 225, 221));
		listSort.setFocusable(false);
		listSort.setFont(new Font("Consolas", Font.BOLD, 17));
		add(listSort);

		barSort = new JScrollPane();
		barSort.setViewportView(listSort);
		barSort.setBounds(50, 110, 285, 285);
		add(barSort);

		listSortBack = new JButton("\u2190");
		listSortBack.setBounds(0, 0, 50, 48);
		listSortBack.setFont(new Font("Consolas", Font.BOLD, 26));
		listSortBack.setVerticalAlignment(SwingConstants.CENTER);
		listSortBack.setForeground(Color.WHITE);
		listSortBack.setBackground(new Color(27, 38, 59));
		listSortBack.setFocusable(false);
		listSortBack.setBorderPainted(false);
		add(listSortBack);

	}

	/**
	 * Gets the JTextArea displaying the sorted list of persons.
	 * 
	 * @return The JTextArea instance.
	 */
	public JTextArea getListSort() {
		return listSort;
	}

	/**
	 * Sets the JTextArea displaying the sorted list of persons.
	 * 
	 * @param listSort The new JTextArea instance.
	 */
	public void setListSort(JTextArea listSort) {
		this.listSort = listSort;
	}

	/**
	 * Gets the JButton for navigating back to the main menu.
	 * 
	 * @return The JButton instance.
	 */
	public JButton getListSortBack() {
		return listSortBack;
	}

	/**
	 * Sets the JButton for navigating back to the main menu.
	 * 
	 * @param listSortBack The new JButton instance.
	 */
	public void setListSortBack(JButton listSortBack) {
		this.listSortBack = listSortBack;
	}

}
