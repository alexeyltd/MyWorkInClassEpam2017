package lesson170624.teacher_work_in_class.first_part;


public class FizzBuzzTest {

	public static void main(String[] args) {

		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(333), "Fizz"));
		System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(5), "Fizz"));

		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(10), "Buzz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(1000), "Buzz"));
		System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(1), "Buzz"));

		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(300), "FizzBuzz"));
		System.out.println(SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(11), "FizzBuzz"));
		System.out.println(SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(1), "1"));

	}


}

