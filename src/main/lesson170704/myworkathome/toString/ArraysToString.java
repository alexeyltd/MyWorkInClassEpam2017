package main.lesson170704.myworkathome.toString;

public class ArraysToString {

	public static void main(String[] args) {

		int[] array = new int[] {0, 1, 2, 3, 4, 5, 6};

		toString(array);

	}

	private static void toString(int[] array) {

		System.out.print("[");

		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}

		System.out.print(array[array.length - 1] + "]");

	}

}
