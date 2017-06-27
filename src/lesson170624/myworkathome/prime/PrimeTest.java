package lesson170624.myworkathome.prime;

public class PrimeTest {

	public static void main(String[] args) {

		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(3), true));
		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(150), false));
		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(3225), false));
		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(89), true));
		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(Integer.MAX_VALUE), false));
		System.out.println(PrimeUnit.assertEquals(PrimeUtils.isPrime(Integer.MAX_VALUE), false));


		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(7), false));
		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(22), true));
		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(31), false));
		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(7231), true));
		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(Integer.MAX_VALUE), true));
		System.out.println(PrimeUnit.assertNotEquals(PrimeUtils.isPrime(Integer.MAX_VALUE), true));

	}

}
