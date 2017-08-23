package main.lesson170823.teacherworkinclass;

import java.util.stream.Stream;

public class MapExamples {

	public static void main(String[] args) {

		Stream.of("b", "a", "n", "a", "n", "a").map(String::toUpperCase)
				.forEach(System.out::print);
	}

}
