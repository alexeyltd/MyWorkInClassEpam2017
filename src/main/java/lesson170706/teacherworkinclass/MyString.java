package main.java.lesson170706.teacherworkinclass;

public class MyString {

	final char[] value;

	public MyString(String valueSource) {
		this.value = valueSource.toCharArray();
	}

	public char[] toCharArray() {
		return value;
	}

	@Override
	public String toString() {
		return new String(value);
	}

	public static void main(String[] args) {


	}
}
