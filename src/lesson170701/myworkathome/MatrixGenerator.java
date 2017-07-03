package lesson170701.myworkathome;

public class MatrixGenerator {


	public static int[][] generate(int size) {
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		return matrix;
	}
}
