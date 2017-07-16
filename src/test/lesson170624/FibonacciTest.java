package lesson170624;

import main.lesson170624.myworkathome.isfibonacci.FibonacciUtils;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

	@Test
	public void testFibonacci() {

		assertEquals(true, FibonacciUtils.isFibonacci(1));
		assertEquals(true, FibonacciUtils.isFibonacci(1));
		assertEquals(true, FibonacciUtils.isFibonacci(987));
		assertEquals(true, FibonacciUtils.isFibonacci(6765));
		assertEquals(false, FibonacciUtils.isFibonacci(-26));
		assertEquals(false, FibonacciUtils.isFibonacci(Integer.MAX_VALUE));
		assertEquals(false, FibonacciUtils.isFibonacci(Integer.MIN_VALUE));

		assertNotEquals(false, FibonacciUtils.isFibonacci(3224));
		assertNotEquals(false, FibonacciUtils.isFibonacci(3235235));
		assertNotEquals(false, FibonacciUtils.isFibonacci(235235));
		assertNotEquals(false, FibonacciUtils.isFibonacci(123));
		assertNotEquals(true, FibonacciUtils.isFibonacci(Integer.MAX_VALUE));
		assertNotEquals(true, FibonacciUtils.isFibonacci(Integer.MIN_VALUE));

	}

}
