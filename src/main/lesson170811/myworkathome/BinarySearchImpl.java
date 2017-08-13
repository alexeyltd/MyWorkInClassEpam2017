package main.lesson170811.myworkathome;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchImpl {

	public static int binarySearch(int[] array, int key) {
		int lo = 0;
		int hi = array.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < array[mid]) {
				hi = mid - 1;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}

		return lo;
	}

	public static void main(String[] args) {


		int[] array = new int[10];

		fill(array);

		System.out.println(Arrays.toString(array));

		int index = binarySearch(array, 25);

		System.out.println("Element should be at index: " + index);


	}

	private static void fill(final int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

}
