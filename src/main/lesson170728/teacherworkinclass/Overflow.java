package main.lesson170728.teacherworkinclass;

public class Overflow extends Exception {

	private final int size;

	public Overflow(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
