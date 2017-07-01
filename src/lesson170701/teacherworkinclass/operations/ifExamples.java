package lesson170701.teacherworkinclass.operations;

public class ifExamples {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage <word>");
			System.exit(0);
		} else {
			System.out.println();
		}

		process(args[0]);

	}

	private static void process(String word) {
		if ("hello".equals(word)) {
			System.out.println("hello");
		} else if ("goodbye".equals(word)) {
			System.out.println("goodbye");
		} else {
			System.out.println("what?");
		}

	}

}
