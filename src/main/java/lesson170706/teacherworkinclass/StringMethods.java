package main.java.lesson170706.teacherworkinclass;

public class StringMethods {

	public static void main(String[] args) {

		String s = "hello";

		for (char c : s.toCharArray()) {

			System.out.println(c);

		}

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));

		}

		s.subSequence(0, 0);

		s.substring(0);

	}

}
