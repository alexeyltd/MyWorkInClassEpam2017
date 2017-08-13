package main.lesson170811.myworkathome;

import main.lesson170811.teacherworkinclass.SortClassExample;
import org.apache.commons.lang.time.StopWatch;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class BinarySearchCollections {

	public static final int LENGTH_OF_ARRAY = 1_000_000;

	public static class B implements Comparable<B> {

		static Random random = new Random();
		int x = random.nextInt(LENGTH_OF_ARRAY);

		@Override
		public int compareTo(@NotNull final B other) {
			return x - other.x;
		}

		@Override
		public String toString() {
			return Integer.toString(x);
		}
	}

	public static void main(String[] args) {
		B[] array = new B[LENGTH_OF_ARRAY];
		fill(array);
	}

	private static void fill(final B[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = new B();
		}

		Arrays.sort(array);

		StopWatch stopWatch = new StopWatch();

		List<B> linkedList = new ArrayList<>();

		System.out.println("STARTING STOPWATCH FOR ADDING IN LINKED LIST");
		stopWatch.start();

		for (int i = 0; i < LENGTH_OF_ARRAY; i++) {
			linkedList.add(new B());
		}

		System.out.println("STOPPING STOPWATCH FOR ADDING IN LINKED LIST");
		stopWatch.stop();
		System.out.println("Stopwatch time for adding in Linked List : " + stopWatch);

		System.out.println("RESETTING STOPWATCH");
		stopWatch.reset();

		System.out.println("STARTING STOPWATCH FOR SORTING IN LINKED LIST");
		stopWatch.start();

		Collections.sort(linkedList);

		System.out.println("STOPPING STOPWATCH FOR SORTING IN LINKED LIST");
		stopWatch.stop();

		System.out.println("Stopwatch time for adding in Linked List : " + stopWatch);

		System.out.println("RESETTING STOPWATCH");
		stopWatch.reset();

		B b = new B();

		System.out.println("STARTING STOPWATCH FOR BINARY SEARCH IN LINKED LIST");
		stopWatch.start();

		int index = Collections.binarySearch(linkedList, b);

		System.out.println("STOPPING STOPWATCH FOR SORTING IN LINKED LIST");
		stopWatch.stop();

		System.out.println("Stopwatch time for binary search in Linked List : " + stopWatch);

		System.out.println(index);


	}

}
