package main.lesson170701.teacherworkinclass.operations;

public class GuardConditions {

	public static void main(String[] args) {

		m(10);

	}

	private static void m(int i) {

		if (i <= 0) {
			return;
		}
		if (i % 2 == 0) {
			return;
		}
		if (i < 100) {
			return;
		}

	}

}
