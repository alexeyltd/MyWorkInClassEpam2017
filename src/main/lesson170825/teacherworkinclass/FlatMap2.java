package main.lesson170825.teacherworkinclass;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap2 {

	public static void main(String[] args) {

		List<String> empty = Arrays.asList();

		List<String> list1 = Arrays.asList("one", "two", "three");

		List<String> list2 = Arrays.asList("one", "two", "three", "four");

		Stream<List<String>> streamOfLists = Stream.of(empty, list1, list2);

		Stream<String> stringStream = streamOfLists.flatMap(list -> list.stream());

		List<String> words = stringStream.collect(Collectors.toList());

		System.out.println(words);

	}

}
