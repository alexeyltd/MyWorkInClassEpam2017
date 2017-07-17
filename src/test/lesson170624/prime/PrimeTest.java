package lesson170624.prime;

import main.lesson170624.myworkathome.prime.PrimeUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeTest {

	@Test
	public void testPrime() {

		assertEquals(true, PrimeUtils.isPrime(3));
		assertEquals(false, PrimeUtils.isPrime(150));
		assertEquals(false, PrimeUtils.isPrime(3225));
		assertEquals(true, PrimeUtils.isPrime(89));
		assertEquals(false, PrimeUtils.isPrime(Integer.MAX_VALUE));
		assertEquals(false, PrimeUtils.isPrime(Integer.MAX_VALUE));

		assertNotEquals(false, PrimeUtils.isPrime(7));
		assertNotEquals(true, PrimeUtils.isPrime(22));
		assertNotEquals(false, PrimeUtils.isPrime(31));
		assertNotEquals(true, PrimeUtils.isPrime(7231));
		assertNotEquals(true, PrimeUtils.isPrime(Integer.MAX_VALUE));
		assertNotEquals(true, PrimeUtils.isPrime(Integer.MAX_VALUE));


	}

}
