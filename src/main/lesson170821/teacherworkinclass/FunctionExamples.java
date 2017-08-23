package main.lesson170821.teacherworkinclass;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExamples {

	public static void main(String[] args) {

		Function<String, Integer> function = s -> s.length();

		Function<String, Integer> function2 = String::length;

		System.out.println(function2.apply("hello"));

		BiFunction<String, String, String> biFunction = (s1, s2) -> s1.concat(s2);

		BiFunction<String, String, String> biFunction2 = String::concat;

		BinaryOperator<String> binaryOperator = String::concat;

		UnaryOperator<String> unaryOperator = s -> s.toUpperCase();

		UnaryOperator<String> unaryOperator2 = String::toUpperCase;

	}

}
