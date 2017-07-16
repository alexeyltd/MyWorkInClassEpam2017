package main.lesson170707.teacherworkinclass;

import java.util.Arrays;

/**
 * Created by alexeypavlenko on 08/07/2017.
 */
public class asd {

	public static int[] make2(int[] a, int[] b) {

		int[] array = new int[2];
		int index = 0;

		if (a.length == 1) {
			array[0] = a[0];
		}

		if (a.length == 2) {
			array[0] = a[0];
			array[1] = a[1];
			return array;
		}

		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
			if (i == array.length - 1) {
				index = i;
				break;
			}
		}

		for (int i = 0; i < b.length - 2; i++) {
			array[index + 1 + i] = b[i];
			if (i == array.length - 1) {
				break;
			}
		}

		return array;
	}

	public static void main(String[] args) {


		int[] a = new int[]{};
		int[] b = new int[]{1, 2};

		System.out.println(Arrays.toString(make2(a, b)));


	}

}
