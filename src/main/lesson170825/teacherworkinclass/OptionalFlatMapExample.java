package main.lesson170825.teacherworkinclass;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {

		String s = null;

		Optional<String> stringOptional = Optional.ofNullable(s);

		Optional<Integer> integerOptional = stringOptional.map(String::length);

	}

}
