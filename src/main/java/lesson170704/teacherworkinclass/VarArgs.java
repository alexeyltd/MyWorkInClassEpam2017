package main.java.lesson170704.teacherworkinclass;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		int x = sum(0, 1);

		System.out.println(sum(1, 2, 3, 4, 5));

	}

	private static int sum(int first, int second, int... params) {

		int sum = first + second;

		System.out.println(Arrays.toString(params));

		for (int value : params) {
			sum += value;
		}

		return sum;
	}

}
