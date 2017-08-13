package main.lesson170811.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SortedSetExample {
	private static final int MAX = 20;


	public static class C implements Comparable<C> {

		static Random random = new Random();
		int x = random.nextInt(SortedSetExample.MAX);

		@Override
		public int compareTo(@NotNull final C other) {
			return x - other.x;
		}

		@Override
		public String toString() {
			return Integer.toString(x);
		}
	}

	public static void main(String[] args) {
		Set<C> set = new TreeSet<>();

		for (int i = 0; i < MAX; i++) {
			set.add(new C());
		}

		System.out.println(set);

		C c = new C();
		System.out.println(c);

		boolean contains = set.contains(c);

		System.out.println(contains);

	}

}
