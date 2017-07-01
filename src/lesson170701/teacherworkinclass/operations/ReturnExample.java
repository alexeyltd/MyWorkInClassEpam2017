package lesson170701.teacherworkinclass.operations;

import java.util.Random;

public class ReturnExample {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage ... ");
			return;
		}

		int x = m();

		return;
	}

	private static int m() {

		Random random = new Random();
		if (random.nextBoolean()) {
			return 10;
		}

		return 0;
	}

}
