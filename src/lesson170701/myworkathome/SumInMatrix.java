package lesson170701.myworkathome;

public class SumInMatrix {

	private static final int MATRIX_SIZE = 10;

	public static void main(String[] args) {

		int[][] matrix = MatrixGenerator.generate(MATRIX_SIZE);

		System.out.println(countPositive(matrix));

	}

	private static int countPositive(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			int[] rows = matrix[i];
			for (int j = 0; j < rows.length; j++) {
				if (rows[j] > 0) {
					sum += rows[j];
				}
				continue;
			}
		}
		return sum;
	}

}
