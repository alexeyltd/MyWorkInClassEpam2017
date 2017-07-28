package main.lesson170728.teacherworkinclass;

public class DivisitionByZero {

	public static void main(String[] args) {

		System.out.println(divide(10, 0));

	}

	private static int divide(final int i, final int j) {

		try {
			return i / j;

		} catch (Exception e) {
			e.printStackTrace();
			return Integer.MAX_VALUE;
		}

	}

}
