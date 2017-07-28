package main.lesson170728.teacherworkinclass;

import java.util.Arrays;

public class MyStack<E> {

	private static final int STACK_CAPACITY = 3;
	private int size;

	private Object[] elements;

	public MyStack(int size) {
		elements = new Object[size];
	}

	public MyStack() {
		this(STACK_CAPACITY);
	}

	public boolean push(E value) throws Exception {
		if (size >= elements.length) {
			throw new Exception("Stack overflow");
		}
		elements[size++] = value;
		return true;
	}

	public E pop() {
		if (size <= 0) {
			return null;
		}
		E result = (E) elements[size - 1];
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
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}
}
