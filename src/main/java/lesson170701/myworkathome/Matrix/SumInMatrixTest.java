package main.java.lesson170701.myworkathome.Matrix;

public class SumInMatrixTest {

	private static final int MATRIX_SIZE = 10;

	public static void main(String[] args) {

//		Random matrix
//		int[][] matrix = MatrixGenerator.generate(MATRIX_SIZE);
		int[][] matrix = {
				{1, 0, 0},
				{-1, 0, 0},

		};
		System.out.println(SumInMatrix.countPositive(matrix));

//		System.out.println(SumInMatrixUtils.assertEquals(SumInMatrix.countPositive(matrix), 1));

	}

}
