package co.edu.unbosque.util;

import java.io.Serializable;

/**
 * Represents a generic singly linked list. It supports basic operations such as
 * insertion, deletion and retrieval.
 * 
 * @author Juan Esteban Quintero, Juan Pablo Urrego
 * @param <E> The type of elements stored in the linked list.
 */
public class MyLinkedList<E> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1666257121250392607L;
	/**
	 * The first node in the linked list.
	 */
	protected Node<E> first;

	/**
	 * Constructs an empty linked list.
	 */
	public MyLinkedList() {

		this.first = null;

	}

	/**
	 * Gets the first node in the linked list.
	 * 
	 * @return The first node in the linked list.
	 */
	public Node<E> getFirst() {
		return first;
	}

	/**
	 * Sets the first node in the linked list.
	 * 
	 * @param first The new first node.
	 */
	public void setFirst(Node<E> first) {
		this.first = first;
	}

	/**
	 * Checks if the linked list is empty.
	 * 
	 * @return True if the linked list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return (this.first == null ? true : false);
	}

	/**
	 * Inserts a new node with the given information after the specified previous
	 * node.
	 * 
	 * @param info     The information to be stored in the new node.
	 * @param previous The node after which the new node will be inserted.
	 */
	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
		}
	}

	/**
	 * Adds a new node with the given information to the beginning of the linked
	 * list.
	 * 
	 * @param info The information to be stored in the new node.
	 */
	public void add(E info) {
		Node<E> newNode = new Node<E>(info);
		newNode.setNext(this.first);
		this.first = newNode;
	}

	/**
	 * Adds a new node with the given information before the last node in the linked
	 * list.
	 * 
	 * @param info The information to be stored in the new node.
	 */
	public void addBeforeLast(E info) {
		Node<E> newNode = new Node<E>(info);
		Node<E> lastNode = getLastNode();
		Node<E> current = getFirst();

		
			while (current != null) {
				if (current.getNext() == lastNode) {
					newNode.setNext(lastNode);
					current.setNext(newNode);
					break;
				}
				current = current.getNext();
			}
		

	}

	/**
	 * Adds a new node with the given information to the end of the linked list.
	 * 
	 * @param info The information to be stored in the new node.
	 */
	public void addLast(E info) {
		Node<E> lastNode = getLastNode();
		if (lastNode != null) {

			insert(info, lastNode);

		} else {
			this.first = new Node<>(info);
		}
	}

	/**
	 * Gets the last node in the linked list.
	 * 
	 * @return The last node in the linked list.
	 */
	public Node<E> getLastNode() {

		Node<E> current = this.first;
		while (current != null && current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}

	/**
	 * Gets the number of elements in the linked list.
	 * 
	 * @return The number of elements in the linked list.
	 */
	public int size() {
		int size = 0;
		Node<E> current = this.first;
		while (current != null) {

			size++;
			current = current.getNext();

		}
		return size;
	}

	/**
	 * Extracts and removes the first element from the linked list.
	 * 
	 * @return The information from the first node.
	 */
	public E extract() {

		E data = null;
		if (this.first != null) {
			data = this.first.getInfo();
			this.first = this.first.getNext();
		}
		return data;
	}

	/**
	 * Extracts and removes the node after the specified previous node.
	 * 
	 * @param previous The node before the node to be extracted.
	 * @return The information from the extracted node.
	 */
	public E extract(Node<E> previous) {
		E data = null;
		if (previous != null && previous.getNext() != null) {
			data = previous.getNext().getInfo();
			previous.setNext(previous.getNext().getNext());
		}
		return data;
	}

	/**
	 * Removes the element at the specified index.
	 * 
	 * @param index The index of the element to be removed.
	 */
	public void remove(int index) {
		if (index < 0 || index >= size())
			return;
		if (index == 0) {
			if (this.first.getNext() != null)
				this.first = this.first.getNext();
			else
				this.first = null;
		} else {
			get(index - 1).setNext(get(index).getNext());
		}
	}

	/**
	 * Gets the node at the specified index.
	 * 
	 * @param index The index of the node to be retrieved.
	 * @return The node at the specified index.
	 */
	public Node<E> get(int index) {
		Node<E> targetNode = null;
		Node<E> currentNode = this.first;
		int count = 0;

		while (currentNode != null && count < index) {
			currentNode = currentNode.getNext();
			count++;
		}
		if (currentNode != null) {
			targetNode = currentNode;
		}
		return targetNode;
	}

	/**
	 * Gets the index of the first occurrence of the specified element.
	 * 
	 * @param info The element to be searched for.
	 * @return The index of the first occurrence, or -1 if not found.
	 */
	public int indexOf(E info) {
		Node<E> currentNode = this.first;
		int infoPos = -1;

		if (!isEmpty()) {
			infoPos = 0;
			while (currentNode != null && !currentNode.getInfo().equals(info)) {
				infoPos++;
				currentNode = currentNode.getNext();
			}
		}
		return infoPos;
	}

	/**
	 * Extracts and removes the last element from the linked list.
	 * 
	 * @return The information from the last node.
	 */
	public E extractLast() {
		E info = null;
		Node<E> curren = this.first;
		int listSize = size();

		if (!isEmpty()) {
			if (listSize == 1) {
				info = curren.getInfo();
				this.first = null;
			} else {
				Node<E> previousLastNode = get(listSize - 2);
				info = extract(previousLastNode);
			}
		}
		return info;
	}

	/**
	 * Returns a string representation of the linked list.
	 * 
	 * @return A string representation of the linked list.
	 */
	@Override
	public String toString() {

		String listtext = "";
		Node<E> current = this.first;
		while (current != null) {
			listtext += current.getInfo().toString();
			if (current.getNext() != null) {

				listtext += "\n";
//				listtext += "->";

			}
			current = current.getNext();
		}
		return listtext;

	}
}
