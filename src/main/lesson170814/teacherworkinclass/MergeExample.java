package main.lesson170814.teacherworkinclass;

public class MergeExample {

	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

	private static void sort(final Comparable[] a, final Comparable[] aux, final int lo, final int hi) {
		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

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

	}

}
