package main.lesson170823.teacherworkinclass;

import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOperationsExamples {

	public static void main(String[] args) {

		Optional<Double> min = Stream.generate(Math::random).limit(20).min(Double::compare);

		System.out.println(min.orElse(0.0));

	}

}
