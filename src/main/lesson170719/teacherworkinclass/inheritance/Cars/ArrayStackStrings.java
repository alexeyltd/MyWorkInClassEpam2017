package main.lesson170719.teacherworkinclass.inheritance.Cars;

import java.util.ArrayDeque;

public class ArrayStackStrings extends ArrayDeque<String> {

	@Override
	public void addLast(final String s) {
//		super.addLast(s);
		throw new UnsupportedOperationException();
	}

	@Override
	public String removeLast() {
//		return super.removeLast();
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(final String s) {
//		return super.add(s);
		throw new UnsupportedOperationException();
	}

	@Override
	public String remove() {
//		return super.remove();
		throw new UnsupportedOperationException();
	}
}
