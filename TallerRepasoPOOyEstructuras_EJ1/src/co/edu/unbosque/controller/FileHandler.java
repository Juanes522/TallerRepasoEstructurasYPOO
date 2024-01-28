package co.edu.unbosque.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Utility class for handling file operations, such as reading/writing and
 * reading/writing serialized objects.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 */

public class FileHandler {

	/**
	 * Scanner for the reading from text files.
	 */
	private static Scanner lector;

	/**
	 * Represents the file used in file operations.
	 */
	private static File archivo;

	/**
	 * PrintWriter for writing to text files.
	 */
	private static PrintWriter escritor;

	/**
	 * ObjectInputStream for reading serialized objects from a file.
	 */
	private static ObjectInputStream ois;

	/**
	 * ObjectOutputStream for writing serialized objects to a file.
	 */
	private static ObjectOutputStream oos;

	/**
	 * FileOutputStream for handling file output streams in serialized operations.
	 */
	private static FileOutputStream fos;

	/**
	 * Default constructor for FileHandler class.
	 */
	public FileHandler() {}
	
	
	/**
	 * Writes an object to a serialized file.
	 * 
	 * @param fileName The name of the file.
	 * @param obj      The object to be serialized and written to the file.
	 */
	public static void writeSerialized(String fileName, Object obj) {

		try {
			oos = new ObjectOutputStream(new FileOutputStream("src/co/edu/unbosque/model/persistence/" + fileName));
			oos.writeObject(obj);
			oos.close();
		} catch (FileNotFoundException e) {
			System.err.println("Input Error: File not found. (Serialized/Input).");
		} catch (IOException e) {
			System.err.println("Input Error: Check permissions. (Serialized/Entry).");
		}

	}

	/**
	 * Reads an object from a serialized file.
	 * 
	 * @param fileName The name of the file.
	 * @return The deserialized object.
	 */
	public static Object readSerialized(String fileName) {
		try {
			ois = new ObjectInputStream(new FileInputStream("src/co/edu/unbosque/model/persistence/" + fileName));
			Object o = ois.readObject();
			ois.close();
			return o;
		} catch (FileNotFoundException e) {
			System.err.println("Read Error: File not found. (Serialized/Output).");

		} catch (IOException e) {
			System.err.println("Read Error: Check permissions. (Serialized/Output).");
		} catch (ClassNotFoundException e) {
			System.err.println("Read Error: File not found. (Serialized/Output).");
		}

		return null;
	}

	/**
	 * Opens and reads the content of a text file.
	 * 
	 * @param fileName The name of the file.
	 * @return The contents of the file as a string.
	 */
	public static String openFile(String fileName) {

		archivo = new File("src/co/edu/unbosque/model/persistence/" + fileName);
		StringBuilder contenido = new StringBuilder();
		try {
			lector = new Scanner(archivo);
			while (lector.hasNext()) {
				contenido.append(lector.nextLine() + "\n");
			}
			lector.close();
		} catch (FileNotFoundException e) {
			System.err.println("Read Error: File not found.");
		} catch (IOException e1) {
			System.err.println("Read Error: Check permissions.");
		}

		return contenido.toString();
	}

	/**
	 * Writes content to a text file.
	 * 
	 * @param fileName  The name of the file.
	 * @param contenido The content to be written to the file.
	 */
	public static void writeFile(String fileName, String contenido) {
		archivo = new File("src/co/edu/unbosque/model/persistence/" + fileName);
		try {
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);
			escritor.close();
		} catch (FileNotFoundException e) {
			System.err.println("Write Error: File not found.");
			try {
				archivo.createNewFile();
			} catch (IOException e1) {
			}
		} catch (IOException e2) {
			System.err.println("Script Error: Check permissions.");
		}
	}

}