package main.lesson170823.teacherworkinclass;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceExamples {

	public static void main(String[] args) {

		Stream<String> letters = Stream.of("b", "a", "n", "a", "n", "a");

		Optional<String> reduced = letters.reduce((c1, c2) -> c1.concat(c2));

		reduced.ifPresent(System.out::println);

		Optional<Integer> sum = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).reduce((i, j) -> i + j);

		sum.ifPresent(System.out::println);

		Integer integerResult = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(1, (i, j) -> i * j);

		System.out.println(integerResult);

		BinaryOperator<Integer> integerBinaryOperator = (i, j) -> i * j;

		Integer integerResult2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).parallel().reduce(1, integerBinaryOperator, integerBinaryOperator);

		System.out.println(integerResult2);

	}

}
