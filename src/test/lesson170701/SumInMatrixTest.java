package lesson170701;

import main.lesson170701.myworkathome.Matrix.SumInMatrix;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumInMatrixTest {


	@Test
	public void testSumInMatrix() {

		int[][] matrix = {
				{1, 0, 0},
				{-1, 0, 0},

		};

		assertEquals(1, SumInMatrix.countPositive(matrix));

	}

}
