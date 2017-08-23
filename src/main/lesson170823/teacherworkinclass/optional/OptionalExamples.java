package main.lesson170823.teacherworkinclass.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalExamples {

	public static final Random random = new Random();

	public static void main(String[] args) {

		Optional<String> optional = compute();

		String string = optional.orElseGet(() -> ""); // lazy

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

		optional.ifPresent(System.out::println);

	}

	public static Optional<String> compute() {
		return Optional.ofNullable(random.nextBoolean() ? "hello" : null);
	}

}
