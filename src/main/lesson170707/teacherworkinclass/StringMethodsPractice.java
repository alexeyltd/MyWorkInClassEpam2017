package main.lesson170707.teacherworkinclass;

import main.lesson170624.myworkinclass.mytestframework.Asserts;

public class StringMethodsPractice {

	public static void main(String[] args) {

		String s = " Hello ";
		String s2 = "Hello";
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "He l l o  ";
		String s6 = "";

		String result = trim(s4);

		System.out.println(result);


		System.out.println(Asserts.assertEquals(trim(s6), ""));
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertEquals(trim(s4), s4));

	}

	private static String trim(String str) {
//		guard condition
		if (str == null || str.length() == 0) {
			return str;
		}

		if (str.indexOf(' ') <= 0 && str.lastIndexOf(' ') != str.length() - 1) {
			return str;
		}

		//TODO

		for (int i = 0; i < str.length(); i++) {

		}

		return str;

	}

}
