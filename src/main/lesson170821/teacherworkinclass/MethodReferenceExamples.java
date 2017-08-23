package main.lesson170821.teacherworkinclass;

import java.util.function.Function;

public class MethodReferenceExamples {

	public static void main(String[] args) {

		Function<String, Integer> stringIntegerFunction = s -> s.length();

		Function<String, Integer> stringIntegerFunction2 = String::length;

		Runnable runnable = () -> Thread.currentThread().getName();

		Runnable runnable1 = Thread.currentThread()::getName;

	}

}
