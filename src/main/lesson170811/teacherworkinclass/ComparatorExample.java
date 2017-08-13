package main.lesson170811.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ComparatorExample {

	public static class B {
		static Random random = new Random();
		int x = random.nextInt(100);

		@Override
		public String toString() {
			return Integer.toString(x);
		}

	}

	private static class ComparatorB implements Comparator<B> {

		@Override
		public int compare(final B o1, final B o2) {
			return o1.x - o2.x;
		}
	}

	public static void main(String[] args) {

		List<B> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(new B());
		}

//		Collections.sort(list, (o1, o2) -> 0);

		System.out.println(list);

		Collections.sort(list, new ComparatorB().reversed());

		System.out.println(list);
	}
}
