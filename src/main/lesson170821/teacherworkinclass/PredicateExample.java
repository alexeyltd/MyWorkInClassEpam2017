package main.lesson170821.teacherworkinclass;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> predicate = s -> s.isEmpty();

		Predicate<String> predicate2 = String::isEmpty;

		System.out.println(predicate2.test(""));

		BiPredicate<String, String> biPredicate = (line, prefix) -> line.startsWith(prefix);

		BiPredicate<String, String> biPredicate2 = String::startsWith;
	}

}
