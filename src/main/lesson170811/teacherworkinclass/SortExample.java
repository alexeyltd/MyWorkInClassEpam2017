package main.lesson170811.teacherworkinclass;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {

		int[] array = {10, 20, 0, 20, 12, -9, 100};

		int index = find(array, 8);

		System.out.println(index);

		System.out.println(find(array, 20));

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

	}

	private static int find(final int[] array, int index) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == index) {
				return i;
			}
		}
		return -1;
	}

}
