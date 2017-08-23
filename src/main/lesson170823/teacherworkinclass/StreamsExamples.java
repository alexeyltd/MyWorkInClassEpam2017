package main.lesson170823.teacherworkinclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples {

	public static void main(String[] args) {

		Stream<String> stream = Stream.empty();
		Stream<Integer> stream2 = Stream.of(1);
		Stream<Integer> stream3 = Stream.of(0, 1, 2, 3);

		List<String> list = Arrays.asList("one", "two", "three");

		Stream<String> stream4 = list.stream();

		showCount(stream);
		showCount(stream2);
		showCount(stream3);
		showCount(stream4);

		Stream.generate(Math::random).limit(20).forEach(System.out::println);

		Optional<String> any = Stream.<String>empty().findAny();

//		any.ifPresent(System.out::println);

		Stream.of(0, 1, 2, 3).findFirst().ifPresent(System.out::println);


		boolean anyMatch = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).anyMatch(number -> number % 3 == 0);


		Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).filter(number -> number % 3 == 0).forEach(System.out::println);




	}

	private static void showCount(final Stream<?> stream) {
		long count = stream.count();
		System.out.println(count);
	}

}
