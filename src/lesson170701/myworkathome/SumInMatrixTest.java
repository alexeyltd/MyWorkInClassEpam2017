package lesson170701.myworkathome;

public class SumInMatrixTest {

	private static final int MATRIX_SIZE = 10;

	public static void main(String[] args) {

//		Random matrix
		int[][] matrix = MatrixGenerator.generate(MATRIX_SIZE);
		System.out.println(SumInMatrix.countPositive(matrix));

		System.out.println(SumInMatrixUtils.assertEquals(SumInMatrix.countPositive(matrix), 1));

	}

}
