package lesson170624;


public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(assertEquals("Hello", "Hello"));
		System.out.println(assertEquals("Hello", "Hello "));
	}

	public static boolean assertEquals(String actual, String expected) {
		return actual.equals(expected);
	}

}

