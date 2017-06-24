package lesson170624;

public class Equals {

	static String a;

	static String b;

	public static void main(String[] args) {

		compare("X");

	}

	private static void compare(String a) {
		if (a.equals("Hello")) {
			System.out.println("Equals");
		}
	}

}
