package lesson170704.teacherworkinclass;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {

		int[] a = {};

		int[] b;

		b = new int[] {};

		b = new int[0];


		System.out.println(Arrays.toString(a));

		b = new int[10];

		System.out.println(b);

		String s[] = new String[3];

		print(s);
	}

	private static void print(String[] arrayOfStrings) {

		for (String string : arrayOfStrings) {

			System.out.println(string);

		}

	}

}
