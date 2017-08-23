package main.lesson170823.teacherworkinclass;

import java.util.stream.Stream;

public class TransformsExamples {

	public static void main(String[] args) {

		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).distinct().
				forEach(System.out::print);

		Stream.of("b", "a", "n", "a", "n", "a").filter(s -> s.charAt(0) > 'c')
				.forEach(System.out::print);

		Stream.of("b", "a", "n", "a", "n", "a").limit(3).
				forEach(System.out::print);

		Stream.of("b", "a", "n", "a", "n", "a").skip(2).
				forEach(System.out::print);

		Stream.iterate(1, n -> n + 1).skip(5).limit(2).forEach(System.out::print);

	}

}
