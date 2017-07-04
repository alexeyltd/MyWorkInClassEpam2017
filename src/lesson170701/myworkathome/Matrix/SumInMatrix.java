package lesson170701.myworkathome.Matrix;

public class SumInMatrix {

	public static int countPositive(int[][] matrix) {
		int sum = 0;
		INNER: for (int i = 0; i < matrix.length; i++) {
			int[] rows = matrix[i];
			for (int j = 0; j < rows.length; j++) {
				if (rows[j] >= 0) {

				}
				continue INNER;
			}
		}
		return sum;
	}

}
