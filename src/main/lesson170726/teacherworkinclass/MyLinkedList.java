package main.lesson170726.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {

	private int size;

	private Node<E> first;

	private Node<E> last;

	public MyLinkedList() {}

	private static class Node<E> {

		E element;
		Node<E> next;
		Node<E> prev;

		public Node(E element, Node<E> next, Node<E> prev) {
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

	public E remove(int index) {
//		TODO
		return null;
	}


	@Override
	public String toString() {
//		traverse

		StringBuilder result = new StringBuilder("[");

		if (first != null) {
			result.append(first.element);
			Node<E> current = first.next;

			while (current != null) {

				result.append(", ")
						.append(current.element);

				current = current.next;
			}
		}

		result.append("]");

		return result.toString();
	}

	@NotNull
	@Override
	public Iterator<E> iterator() {

		return new Iterator<E>() {

//			Node<E> current = MyLinkedList.this.first;
			Node<E> nextNoneProcessNode = first;

			@Override
			public boolean hasNext() {
				return nextNoneProcessNode != null;
			}

			@Override
			public E next() {
				E result = nextNoneProcessNode.element;
				nextNoneProcessNode = nextNoneProcessNode.next;
				return result;
			}

		};

	}
}
