package main.lesson170823.teacherworkinclass;

import java.util.stream.Stream;

public class PrintTwentyNumbers {

	public static void main(String[] args) {

		Stream.iterate(0, n -> n + 2).limit(20).forEach(System.out::println);

	}

}
