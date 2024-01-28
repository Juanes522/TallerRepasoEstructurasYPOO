package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.model.persistence.PersonDAO;
import co.edu.unbosque.util.exception.InvalidCharacterException;
import co.edu.unbosque.util.exception.InvalidDateException;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.MainWindow;

/**
 * Controller class responsible for handling user interactions and coordinating
 * function of the application. Implements ActionListener for handling GUI
 * events.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */

public class Controller implements ActionListener {

	private Console con;

	/**
	 * Data Access Object for managing person operations.
	 */
	private PersonDAO pdao;

	/**
	 * Main window of the application.
	 */
	private MainWindow mw;

	/**
	 * Name of the person obtained from user input.
	 */
	private String name;

	/**
	 * Date string obtained from user input.
	 */
	private String dateString;

	/**
	 * LocalDate object representing the formatted date.
	 */
	private LocalDate dateFormatted;

	/**
	 * Default constructor for the Controller class. Initializes PersonDAO and
	 * MainWindow. Adds action listeners to various components in the MainWindow.
	 */
	public Controller() {
		con = new Console();
		pdao = new PersonDAO();
		mw = new MainWindow();

		addReaders();
	}

	/**
	 * Entry point for running the application.
	 */
	public void run() {

		mw.setVisible(true);
		mw.getMenuPanel().setVisible(true);
		mw.getRegistrationPanel().setVisible(false);
		mw.getPersonListPanel().setVisible(false);
		mw.getListSortByAgePanel().setVisible(false);

//		Random r = new Random();
//		int rand = r.nextInt(100);
//
//		con.println(pdao.show()+"\n");
//
//		while (true) {
//			con.println("test:");
//
//			con.print("name: ");
//			String name = con.nextLine();
//
//			con.print("date:");
//			String dateStr = con.nextLine();
//			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//			LocalDate date = LocalDate.parse(dateStr, format);
//
//			con.print("id:");
//			int id = con.nextInt();
//			con.burn();
//
//			
//			pdao.create(new PersonDTO(name, date, id));
//
//			con.println(pdao.show() + "\n--------------");
//		}
//		con.println("-----");

//		con.println(pdao.showAgeOrder());	
	}

	/**
	 * Adds action listeners to GUI components.
	 */
	public void addReaders() {
		mw.getMenuPanel().getRegistrationButton().addActionListener(this);
		mw.getMenuPanel().getRegistrationButton().setActionCommand("register");

		mw.getMenuPanel().getListButton().addActionListener(this);
		mw.getMenuPanel().getListButton().setActionCommand("listPerson");

		mw.getMenuPanel().getListSortButton().addActionListener(this);
		mw.getMenuPanel().getListSortButton().setActionCommand("listSort");

		mw.getRegistrationPanel().getConfirm().addActionListener(this);
		mw.getRegistrationPanel().getConfirm().setActionCommand("confirm");

		mw.getRegistrationPanel().getRegisterBack().addActionListener(this);
		mw.getRegistrationPanel().getRegisterBack().setActionCommand("backFromRegister");

		mw.getPersonListPanel().getListBack().addActionListener(this);
		mw.getPersonListPanel().getListBack().setActionCommand("backFromList");

		mw.getListSortByAgePanel().getListSortBack().addActionListener(this);
		mw.getListSortByAgePanel().getListSortBack().setActionCommand("backFromSortList");
	}

	/**
	 * Handles actionPerformed events from GUI components.
	 * 
	 * @param e The ActionEvent representing the user's interaction.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "register": {

			mw.getMenuPanel().setVisible(false);
			mw.getRegistrationPanel().setVisible(true);
			mw.getPersonListPanel().setVisible(false);
			mw.getListSortByAgePanel().setVisible(false);

			break;
		}
		case "listPerson": {

			mw.getMenuPanel().setVisible(false);
			mw.getRegistrationPanel().setVisible(false);
			mw.getPersonListPanel().setVisible(true);
			mw.getListSortByAgePanel().setVisible(false);
			mw.getPersonListPanel().getListPerson().setText(pdao.show());

			break;
		}
		case "listSort": {
			mw.getMenuPanel().setVisible(false);
			mw.getRegistrationPanel().setVisible(false);
			mw.getPersonListPanel().setVisible(false);
			mw.getListSortByAgePanel().setVisible(true);
			mw.getListSortByAgePanel().getListSort().setText(pdao.showAgeOrder());

			break;
		}
		case "backFromRegister": {

			mw.getMenuPanel().setVisible(true);
			mw.getRegistrationPanel().setVisible(false);
			mw.getPersonListPanel().setVisible(false);
			mw.getListSortByAgePanel().setVisible(false);
			mw.getRegistrationPanel().getPersonName().setText("");
			mw.getRegistrationPanel().getDate().setText("");

			break;
		}
		case "backFromList": {

			mw.getMenuPanel().setVisible(true);
			mw.getRegistrationPanel().setVisible(false);
			mw.getPersonListPanel().setVisible(false);
			mw.getListSortByAgePanel().setVisible(false);

			break;
		}
		case "backFromSortList": {
			mw.getMenuPanel().setVisible(true);
			mw.getRegistrationPanel().setVisible(false);
			mw.getPersonListPanel().setVisible(false);
			mw.getListSortByAgePanel().setVisible(false);

			break;
		}
		case "confirm": {
			int validation = 0;

			Random r = new Random();
			int rand = r.nextInt(800);

			try {
				name = mw.getRegistrationPanel().getPersonName().getText();
				if (name.matches("^[a-zA-Z ]+$") == false) {
					throw new InvalidCharacterException();
				}

			} catch (InvalidCharacterException e2) {

				JOptionPane.showMessageDialog(null, e2.getMessage() + " write a correct name", "Register Error",
						JOptionPane.ERROR_MESSAGE);
				validation--;
			}
			validation++;

			try {
				dateString = mw.getRegistrationPanel().getDate().getText();

				DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate date = LocalDate.parse(dateString, format);

				dateFormatted = date;

				if (dateFormatted != null && (dateFormatted.getYear() < 1970 || dateFormatted.getYear() > 2006)) {
					JOptionPane.showMessageDialog(null, "invalid date, write a date between 1970 and 2006",
							"Register Error", JOptionPane.ERROR_MESSAGE);
					validation--;
				}

				if (dateString.matches("(.*)[^0-9/](.*)") || dateString.equals("")) {
					throw new InvalidDateException();
				}

			} catch (InvalidDateException e3) {
				JOptionPane.showMessageDialog(null, e3.getMessage() + " write a correct date" + e3.getCause(),
						"Register Error", JOptionPane.ERROR_MESSAGE);
				validation--;
			} catch (DateTimeParseException e2) {
				JOptionPane.showMessageDialog(null, "invalid date, write a correct date in the format yyyy/MM/dd",
						"Register Error", JOptionPane.ERROR_MESSAGE);
				validation--;
			}

			validation++;

			if (validation == 2) {

				pdao.create(new PersonDTO(name, dateFormatted, rand));

				JOptionPane.showMessageDialog(mw, "Person registered", "Register Success",
						JOptionPane.INFORMATION_MESSAGE);

				mw.getRegistrationPanel().getPersonName().setText("");
				mw.getRegistrationPanel().getDate().setText("");

			} else {
				JOptionPane.showMessageDialog(mw, "Error Registering a person", "Register Error",
						JOptionPane.ERROR_MESSAGE);
			}

			break;

		}

		}

	}

}
