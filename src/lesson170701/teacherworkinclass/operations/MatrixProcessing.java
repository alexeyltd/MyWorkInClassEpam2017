package lesson170701.teacherworkinclass.operations;

public class MatrixProcessing {

	public static void main(String[] args) {

		int[][] matrix = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8}
		};

		int k = count(matrix, 10);

		System.out.println(k);

	}

	private static int count(int[][] matrix, int max) {

		int result = 0;
		int sum = 0;

		OUTER:
		for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				sum += row[j];
				result++;
				if (sum > max) {
					break OUTER;
				}
			}
		}

		return result;
	}

}
