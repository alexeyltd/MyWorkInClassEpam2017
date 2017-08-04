package main.lesson170804.teacherworkinclass.bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsExamples {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3);
		List<Double> doubleList = Arrays.asList(1.2,2.1,3.3);

		printNumbers(integerList);
		printNumbers(doubleList);

		List<Number> numbers = new ArrayList<>();
		List<Integer> integerList1;


		fill(numbers);
//		fill(integerList1);
	}

	private static void fill(final List<? super Number> numbers) { // Lower bound, store is allowed and extract is forbidden
		numbers.add(1);
	}

	private static void printNumbers(final List<? extends Number> list) { // Upper bound, EXTract is allowed and Store is forbidden
		for (Number number : list) {
			System.out.println(number);
		}
	}


}
