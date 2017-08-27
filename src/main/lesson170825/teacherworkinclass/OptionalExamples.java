package main.lesson170825.teacherworkinclass;

import java.util.Optional;

public class OptionalExamples {

	public static void main(String[] args) {

		System.out.println(hasThreeDigits(null));
		System.out.println(hasThreeDigits(100));
		System.out.println(hasThreeDigits(99));

	}

//	public static boolean hasThreeDigits(Integer n) {
//
//		if (n == null) {
//			return false;
//		}
//		String result = Integer.toString(n);
//
//		return result.length() == 3;
//	}

	public static boolean hasThreeDigits(Integer n) {
		return Optional.ofNullable(n).map(x -> Integer.toString(x))
				.filter(s -> s.length() == 3).isPresent();
	}

}
