package main.lesson170726.teacherworkinclass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Iterator<String> stringIterator = new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public String next() {
				return "hello";
			}

		};

		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
	}

}
