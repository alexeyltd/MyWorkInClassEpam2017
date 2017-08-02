package main.lesson170802.teacherworkinclass.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamples {

	public static void main(String[] args) {

		List<String> strings = Collections.checkedList(new ArrayList<>(), String.class);

		strings.add("one");

		printList(strings);
	}

	private static void printList(final List<String> strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}

}
