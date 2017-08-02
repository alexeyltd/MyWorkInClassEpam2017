package main.lesson170802.teacherworkinclass.generics;

import java.util.Arrays;

public class MyStack<E> {

	private static final int DEFAULT_MAX_SIZE = 3;

	private final E[] elements;

	private int size;

	public MyStack() {
		this(DEFAULT_MAX_SIZE);
	}

	public MyStack(int size) {
		elements = (E[]) new Object[size];
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

		E result = elements[--size];
		elements[size] = null;

		return result;
	}

	public int size() {
		return size;
	}

	public E tos() {
		return size <= 0 ? null : elements[size - 1];
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements,0, size));
	}
}
