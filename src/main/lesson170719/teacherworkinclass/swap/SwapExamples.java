package main.lesson170719.teacherworkinclass.swap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapExamples {

	public static void main(String[] args) {

		int x = 100;

		int y = 50;

		int tmp = x;

		x = y;

		y = tmp;

		x += y;

//		#100 + 50

		y = x - y;

//		#100

		x -= y;

//		#50

		swap(x, y);

		int[] array = {100, 50};
		swap(array);

		System.out.println(Arrays.toString(array));

	}

	private static void swap(final int[] array) {
		int tmp = array[0];
		array[0] = array[1];
		array[1] = tmp;
	}

	private static void swap(int x, int y) {
		int tmp = x;
		x = y;
		y = tmp;
	}

}
