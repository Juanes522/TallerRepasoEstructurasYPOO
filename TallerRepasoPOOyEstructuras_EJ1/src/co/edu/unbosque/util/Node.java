package co.edu.unbosque.util;

import java.io.Serializable;

/**
 * Represents a generic node in a linked list. The node contains information of
 * type E, a reference to the next node.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 * @param <E> The type of information stored in the node.
 */
public class Node<E> implements Serializable {

	/**
	 * Information stored in the node.
	 */
	private E info;

	/**
	 * Reference to the next node in the linked list.
	 */
	private Node<E> next;

	/**
	 * Parameterized constructor for the Node class. Initializes the node given
	 * information and reference to the next node.
	 * 
	 * @param info The information to be stored in the node.
	 * @param next Reference to the next node in the linked list.
	 */
	public Node(E info, Node<E> next) {
		super();
		this.info = info;
		this.next = next;
	}

	/**
	 * Constructor for creating a node with only information. Calls the
	 * parameterized constructor with next set to null.
	 * 
	 * @param info The information to be stored in the node.
	 */
	public Node(E info) {

		this(info, null);

	}

	/**
	 * Gets the information stored in the node.
	 * 
	 * @return The information stored in the node.
	 */
	public E getInfo() {
		return info;
	}

	/**
	 * Sets the information to be stored in the node.
	 * 
	 * @param info The new information to be stored in the node.
	 */
	public void setInfo(E info) {
		this.info = info;
	}

	/**
	 * Gets the reference to the next node in the linked list.
	 * 
	 * @return The reference to the next node.
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * Sets the reference to the next node in the linked list.
	 * 
	 * @param next The new reference to the next node.
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * Returns a string representation of the node.
	 * 
	 * @return A string representation of the node.
	 */
	@Override
	public String toString() {
		return "Node [info=" + info + ", next=" + next + "]";
	}

}
