package main.lesson170706.teacherworkinclass;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {

		int[] array = {0, 1, 2};

		String s = toString(array);

		System.out.println(s);

	}

	private static String toString(int[] array) {

		StringBuilder stringBuilder = new StringBuilder("[");

		for (int number : array) {
			stringBuilder.append(number);

			if (number != array[array.length - 1]) {
				stringBuilder.append(",");
			}
		}
		stringBuilder.append("]");

		return stringBuilder.toString();
	}

}
