package main.lesson170814.myworkinclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortExample {

	public static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = a[j++];
			} else if (j > hi) {
				a[k] = a[i++];
			} else if (less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

	private static boolean less(final Comparable first, final Comparable second) {
		return first.compareTo(second) < 0;
	}

	public static void main(String[] args) {

		Integer[] array = {10, 20, 30, 40, 15, 25, 35, 35};
		Integer[] aux = new Integer[array.length];

		merge(array, aux, 0, 4, array.length - 1);

		System.out.println(Arrays.toString(array));

	}
}
