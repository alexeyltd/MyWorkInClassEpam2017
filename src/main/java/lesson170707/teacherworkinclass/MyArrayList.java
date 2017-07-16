package main.java.lesson170707.teacherworkinclass;

import java.util.Arrays;

public class MyArrayList<E> {

	private static final int DEFAULT_SIZE = 2;

	private Object[] elements = new Object[DEFAULT_SIZE];

	private int size = 0;


	public void add(E object) {

		if (size == elements.length) {
			grow();
		}

		elements[size++] = object;
	}

	private void grow() {

		int oldCapasity = elements.length;
		int newCapacity = oldCapasity + (oldCapasity >> 1);


	}

	public void remove(int i) {

		if (i >= size || i < 0) {
			return;
		}

		System.arraycopy(elements, i + 1, elements, i, size - i - 1);

		elements[--size] = null;

	}

	@Override
	public String toString() {
		return "MyArrayList{" +
				"elements=" + Arrays.toString(elements) +
				", size=" + size +
				'}';
	}
}
