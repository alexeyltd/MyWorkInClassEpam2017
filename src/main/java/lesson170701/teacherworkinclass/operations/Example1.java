package main.java.lesson170701.teacherworkinclass.operations;

public class Example1 {

	public static void main(String[] args) {

		Object o = new String();

		process(o);

	}

	private static void process(Object o) {

		if (o instanceof String) {

			System.out.println(((String) o).length());

		}

	}

}
