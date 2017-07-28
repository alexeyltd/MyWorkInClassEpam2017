package main.lesson170728.teacherworkinclass;

public class RuntimeExceptionSxamples {

	public static void main(String[] args) {

		cast();

	}

	private static void cast() {

		Object o = "hello";
		o = new StringBuffer();
		String s = (String) o;

		String string = castToString(o);

		System.out.println(string);

		String cast = castToStringWithInstanceOf(o);

		System.out.println(cast);

	}

	private static String castToStringWithInstanceOf(final Object o) {
		return o instanceof String ? (String) o : "";
	}

	private static String castToString(Object o) {

		String s;

		try {
			s = (String) o;
		} catch (ClassCastException e) {
			s = "";
		}

		return s;

	}

}
