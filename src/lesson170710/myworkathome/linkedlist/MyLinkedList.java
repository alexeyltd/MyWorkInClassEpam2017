package lesson170710.myworkathome.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<E> {

	private int size;

	private Node<E> first;

	private Node<E> last;

	public MyLinkedList() {

	}

	private static class Node<E> {

		E element;
		Node<E> next;
		Node<E> prev;

		Node(E element, Node<E> next, Node<E> prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}

	}

	public void add(E value) {

		Node<E> lastReference = last;

		Node<E> newNode = new Node<>(value, null, last);

		last = newNode;

		if (lastReference == null) {
			first = newNode;
		} else {
			lastReference.next = newNode;
		}

		size++;

	}

	public boolean remove(E value) {

		boolean result = false;

		Node<E> current = first;

		Node<E> prev = null;

		if (first == null) {
			last = null;
		}

		while (current != null) {

			if (current.element.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}


		return result;
	}

	public void remove(int index) {

		checkindex(index);


//		find node with specific index use binary search
		Node<E> current = getCurrentNode(index);

		if (current.prev == null) {
			first = current.next;
		} else {
			current.prev.next = current.next;
			current.prev = null;
		}

		if (current.next == null) {
			last = current.prev;
		} else {
			current.next.prev = current.prev;
			current.next = null;
		}

		current.element = null;
		size--;

	}

	private Node<E> getCurrentNode(int index) {
		Node<E> current = null;

		if (index < size / 2) {

			current = first;

			for (int i = 0; i < index; i++) {
				current = current.next;
			}

		} else {

			current = last;

			for (int i = size - 1; i > index; i++) {
				current = current.prev;
			}

		}

		return current;
	}

	private void checkindex(int index) {

		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("index is out of list");
		}

	}


	@Override
	public String toString() {
//		traverse

		StringBuilder result = new StringBuilder("[");

		if (first != null) {
			result.append(first.element);
			Node<E> current = first.next;

			while (current != null) {

				result.append(", ").append(current.element);

				current = current.next;
			}
		}

		result.append("]");

		return result.toString();
	}
}
