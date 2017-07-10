package lesson170704.myworkathome.radixsort;

import com.google.common.base.Stopwatch;

import java.util.Arrays;

public class RadixSortTest {

	public static final int ARRAY_SIZE = 1_000_000;

	public static void main(String[] args) {


		int[] arrayOne = new int[ARRAY_SIZE];

		arrayInit(arrayOne);

		Stopwatch stopwatch = Stopwatch.createStarted();

		RadixSort.radixSort(arrayOne);

		stopwatch.stop();

		System.out.println(Arrays.toString(arrayOne));
		System.out.println(stopwatch);

		int[] arrayTwo = new int[ARRAY_SIZE];

		arrayInit(arrayTwo);

		Stopwatch stopwatchTwo = Stopwatch.createStarted();

		Arrays.sort(arrayTwo);

		stopwatchTwo.stop();

		System.out.println(Arrays.toString(arrayTwo));
		System.out.println(stopwatchTwo);


	}

	private static void arrayInit(int[] arrayOne) {
		for (int i = 0; i < ARRAY_SIZE; i++) {
			arrayOne[i] = (int)(Math.random() * ARRAY_SIZE);
		}
	}

}
