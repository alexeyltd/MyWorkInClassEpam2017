package main.lesson170624.teacherworkinclass.first_part;

public class Equals {

	static String a;

	static String b;

	public static void main(String[] args) {

		compare("C");

	}

	private static void compare(String a) {
		if (a.equals("Hello")) {
			System.out.println("Equals");
		}
	}

}
