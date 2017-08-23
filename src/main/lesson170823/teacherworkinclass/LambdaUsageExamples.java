package main.lesson170823.teacherworkinclass;

import java.util.*;

public class LambdaUsageExamples {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Boston");
		list.add("Moscow");
		list.add("Alma-ata");

		System.out.println(list);

		list.forEach(System.out::println);

		list.removeIf(s -> s.length() > 6);

	}

}
