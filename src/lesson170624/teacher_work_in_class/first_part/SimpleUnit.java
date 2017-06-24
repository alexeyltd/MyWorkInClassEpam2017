package lesson170624.teacher_work_in_class.first_part;

public class SimpleUnit {


	public static boolean assertNotEquals(String actual, String expected) {
		boolean notEquals = !actual.equals(expected);
		if (!notEquals) {
			System.err.println("Test Failed: expected NOT " + expected + ", but actual " + actual);
		}
		return notEquals;
	}

	public static boolean assertEquals(String actual, String expected) {
		boolean equals = actual.equals(expected);
		if (!equals) {
			System.err.println("Test Failed: expected " + expected + ", but actual " + actual);
		}
		return equals;
	}
}
