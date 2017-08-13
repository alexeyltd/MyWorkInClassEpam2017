package main.lesson170811.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.Random;

public class SortClassExample {

	public static class A implements Comparable<A> {

		static Random random = new Random();
		int x = random.nextInt(100);

		@Override
		public int compareTo(@NotNull final A other) {
			return x - other.x;
		}

		@Override
		public String toString() {
			return Integer.toString(x);
		}
	}

	public static void main(String[] args) {
		A[] array = new A[10];
		fill(array);
	}

	private static void fill(final A[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new A();
		}

		System.out.println(Arrays.toString(array));

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		List<A> list = new LinkedList<>();

		for (int i = 0; i < 10; i++) {
			list.add(new A());
		}

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}

}
