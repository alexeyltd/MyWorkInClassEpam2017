package main.lesson170823.teacherworkinclass;

import java.util.*;
import java.util.stream.Stream;

public class StreamLifeCycleExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Pete");
		list.add("John");
		list.add("Ann");

		Stream<String> stringStream = list.stream().map(s -> s.toUpperCase());

		list.add("Jane");
		list.add("Kate");

		Stream<String> limited = stringStream.limit(5);

		stringStream.forEach(System.out::println);

		limited.forEach(System.out::println);
	}

}
