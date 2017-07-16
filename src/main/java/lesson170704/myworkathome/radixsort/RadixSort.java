package main.java.lesson170704.myworkathome.radixsort;

public class RadixSort {
//	main function with original array and n - length of array
	public static void radixSort(int[] array) {

		int m = getMaxValue(array);

//		i - current digit number
		for (int i = 1; m / i > 0; i *= 10) {
			countSort(array, i);
		}

	}

	private static void countSort(int[] array, int digit) {

		int[] result = new int[array.length];

//		initialize local array for counting digits // buckets from 0 to 9
		int[] count = new int[10];

//		save occurrences in count[]
		for (int anArray : array) {
			count[(anArray / digit) % 10]++;
		}

//		actual position
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

//		build result array
		for (int i = array.length - 1; i >= 0; i--) {
			result[count[(array[i] / digit) % 10] - 1] = array[i];
			count[(array[i] / digit) % 10]--;
		}


		System.arraycopy(result, 0, array, 0, array.length);
	}

	//	function for finding max value in our array
	private static int getMaxValue(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}

		return max;
	}

}
