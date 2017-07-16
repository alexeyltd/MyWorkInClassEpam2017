package main.java.lesson170714.teacherworkinclass.finalexamples;

public class FinalExamples {

	public static void main(String[] args) {

		final int x = 10;

		process(x);

		System.out.println(x);
	}

	private static int process(final int value) {
		return value + 10;
	}

}
