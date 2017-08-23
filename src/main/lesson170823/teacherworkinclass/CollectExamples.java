package main.lesson170823.teacherworkinclass;

import com.intellij.util.containers.HashSet;

import java.util.Set;
import java.util.stream.Stream;

public class CollectExamples {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("b", "a", "n", "a", "n", "a");

		StringBuilder builder = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

		System.out.println(builder.toString());

		Stream<String> stream2 = Stream.of("b", "a", "n", "a", "n", "a");

		Set<String> collect = stream2.collect(HashSet::new, HashSet::add, HashSet::addAll);

		System.out.println(collect);
	}

}
