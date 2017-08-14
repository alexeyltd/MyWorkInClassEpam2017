package main.lesson170814.myworkinclass;

import java.util.Arrays;

public class MergeSort2Example {

	public static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi) {
		System.arraycopy(a, lo, aux, lo, a.length);

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

	private static boolean less(final Comparable comparable, final Comparable other) {
		return comparable.compareTo(other) < 0;
	}

	public static void main(String[] args) {
		Integer[] array = {10, 20, 30, 40, 15, 25, 35, 45};
		Integer[] aux = new Integer[array.length];

		merge(array, aux, 0, 3, array.length - 1);

		System.out.println(Arrays.toString(array));

	}

}
