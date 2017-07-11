package lesson170707.myworkathome.stringmethods;

import lesson170624.myworkinclass.mytestframework.Asserts;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethodsPractice {

	public static void main(String[] args) {

		String s = " Hello ";
		String s2 = "Hello";
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "He l l o  ";
		String s6 = "";
		String s7 = "abc";

		String result = trim(s4);

		String s8 = replace(s7, 'a', 'b');

		System.out.println(result);
		System.out.println(s8);


		System.out.println(Asserts.assertEquals(trim(s6), ""));
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertEquals(trim(s4), s4));

	}

	private static String replace(String str, char oldChar, char newChar) {

		char[] chars = str.toCharArray();

		if (oldChar != newChar) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == oldChar) {
					chars[i] = newChar;
				}
			}

			return String.valueOf(chars);
		}

		return str;
	}

	private static String trim(String str) {
//		guard condition
		if (str == null || str.length() == 0) {
			return str;
		}

		if (str.indexOf(' ') <= 0 && str.lastIndexOf(' ') != str.length() - 1) {
			return str;
		}

		Pattern pattern = Pattern.compile("\\s+");
		Matcher m = pattern.matcher(str);
		str = m.matches() ? m.group(1) : str;

		return str;

	}

}
