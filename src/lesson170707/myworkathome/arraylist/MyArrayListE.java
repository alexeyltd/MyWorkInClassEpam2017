package lesson170707.myworkathome.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayListE<E> {

//	default capacity in list
	private static final int CAPACITY = 10;

	private int size;

	Object[] elements;


	public MyArrayListE() {
		elements = new Object[CAPACITY];
	}

	public MyArrayListE(int capacity) {

		if (capacity >= 0) {
			elements = new Object[capacity];
		} else {
			throw new IllegalArgumentException("capacity should be positive");
		}

	}

	public void add(E value) {

		if (size == elements.length) {
			increase();
		}

		elements[size++] = value;

	}
//	increase list if we don't have enough space
	private void increase() {

		int oldCapacity = elements.length;

//		increase our array in 1.5 times
		int newCapacity = oldCapacity + (oldCapacity >> 1);

		Object[] array = new Object[newCapacity];

		System.arraycopy(elements, 0, array, 0, size);

		elements = array;
	}

	public int size() {
		return size;
	}

	public E get(int index) {

		checkindex(index);

		return (E) elements[index];

	}

	public E set(int index, E element) {

		checkindex(index);

		E value = (E) elements[index];

		elements[index] = element;

		return value;

	}

	public void remove(E value) {

		if (value == null) {
			for (int i = 0; i < elements.length; i++) {
				if (elements[i] == null) {
					delete(i);
				}
			}
		} else {
			for (int i = 0; i < elements.length; i++) {
				if (value.equals(elements[i])) {
					delete(i);
				}
			}
		}

	}

	private void delete(int index) {

		int numMove = size - index - 1;

		if (numMove > 0) {
			System.arraycopy(elements, index + 1, elements, index, numMove);
		}

		elements[--size] = null;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void checkindex(int index) {

		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("check index");
		}

	}


	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder("[" + elements[0]);

		for (int i = 1; i < elements.length; i++) {
			stringBuilder.append(i).append(", ");
		}

		stringBuilder.append(elements[elements.length - 1]).append("]");

		return stringBuilder.toString();
	}

}
