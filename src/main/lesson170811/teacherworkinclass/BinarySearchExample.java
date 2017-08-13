package main.lesson170811.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class BinarySearchExample {

	public static class D implements Comparable<D> {

		static Random random = new Random();
		int x = random.nextInt(10);

		@Override
		public int compareTo(@NotNull final D other) {
			return x - other.x;
		}

		@Override
		public String toString() {
			return Integer.toString(x);
		}
	}

	public static void main(String[] args) {

		List<D> list = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			list.add(new D());
		}

		System.out.println(list);

		D key = new D();

		System.out.println(key);

		int index = Collections.binarySearch(list, key);

		System.out.println(index);

		Collections.sort(list);

		index = Collections.binarySearch(list, key);

		System.out.println(index);


	}

}
