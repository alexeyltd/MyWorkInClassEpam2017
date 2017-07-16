package main.java.lesson170701.teacherworkinclass.operations;

public class ifExamples {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage <word>");
			System.exit(0);
		}

		process(args[0]);


	}

	private static void process(String word) {
		if (word.equals("hello")) {
			System.out.println("hello");

		} else if (word.equals("goodbye")) {
			System.out.println("goodbye");

		} else {
			System.out.println("what?");

		}
	}

}
