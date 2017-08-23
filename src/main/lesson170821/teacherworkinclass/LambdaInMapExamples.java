package main.lesson170821.teacherworkinclass;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class LambdaInMapExamples {

	public static void main(String[] args) {

		Map<String, String> staff = new TreeMap<>();

		staff.put("John", "Boston");
		staff.put("Mary", "New York");
		staff.put("Pete", "Boston");
		staff.put("Ann", "Moscow");
		staff.put("Jane", "Boston");
		staff.put("Harry", "Hogwartz");

		staff.replaceAll((BinaryOperator<String>) (s1, s2) -> s2.toUpperCase());

		System.out.println(staff);

		staff.computeIfAbsent("Kate", p -> "Paris");

	}

}
