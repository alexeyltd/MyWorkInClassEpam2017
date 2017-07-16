package main.java.lesson170712.teacherworkinclass.stack;

import java.util.Arrays;

public class MyStack<E> {

	private static final int DEFAULT_MAX_SIZE = 3;

	private final Object[] elements;

	private int size;

	public MyStack() {
		this(DEFAULT_MAX_SIZE);
	}

	public MyStack(int size) {
		elements = new Object[size];
		size = 0;
	}

	public boolean push(E value) {

//		guard condition
//		stack overflow
		if (size >= elements.length) {
			return false;
		}

		elements[size++] = value;

		return true;
	}

	public E pop() {

//		guard condition
//		stack underflow
		if (size <= 0) {
			return null;
		}

		E result = (E) elements[--size];
		elements[size] = null;

		return result;
	}

	public int size() {
		return size;
	}

	public E tos() {
		return size <= 0 ? null : (E) elements[size - 1];
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements,0, size));
	}
}
