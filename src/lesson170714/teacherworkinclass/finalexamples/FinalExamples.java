package lesson170714.teacherworkinclass.finalexamples;

public class FinalExamples {

	public static void main(String[] args) {

		int x = 10;

		process(x);

		System.out.println(x);
	}

	private static int process(final int value) {
		return value + 10;
	}

}
