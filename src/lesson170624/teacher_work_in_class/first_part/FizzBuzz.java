package lesson170624.teacher_work_in_class.first_part;

public class FizzBuzz {
	static String fizzBuzz(int i) {
		String result = "";
		if (i % 3 == 0) {
			result += "Fizz";
		}
		if (i % 5 == 0) {
			result += "Buzz";
		}
		return "".equals(result) ? Integer.toBinaryString(i) : result;
	}
}
