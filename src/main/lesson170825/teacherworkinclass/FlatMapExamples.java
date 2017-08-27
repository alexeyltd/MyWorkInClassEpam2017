package main.lesson170825.teacherworkinclass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamples {

	public static void main(String[] args) {

//		String[] array = { "hello", "world"};
//
//		Stream<String> stringStream = Arrays.stream(array);
//
//		Stream<String[]> stringArrays = stringStream.map(s -> s.split(""));
//
////		Stream<Stream<String>> map = stringArrays.map(strings -> Arrays.stream(strings));
//
//
//		Stream<String> streamOfLetters = stringArrays.flatMap(strings -> Arrays.stream(strings));
//
//		List<String> distinctLetters = streamOfLetters.distinct().collect(Collectors.toList());
//
//		System.out.println(distinctLetters);

		String[] array = { "hello", "world"};

		//		Stream<Stream<String>> map = stringArrays.map(strings -> Arrays.stream(strings));

		System.out.println(Arrays.stream(array)
				.map(s -> s.split(""))
				.flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList()));

	}

}
