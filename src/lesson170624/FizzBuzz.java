package lesson170624;


public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("start");
		
		System.out.println(assertEquals("Hello", "Hello"));
		System.out.println(assertEquals("Hello", "Hello "));

		String result = fizzBuzz(3);

		System.out.println(assertEquals(result, "Fizz"));


	}

	private static String fizzBuzz(int i) {
		return null;
	}


	public static boolean assertEquals(String actual, String expected) {
		return actual.equals(expected);
	}

}

