package lesson170624.my_work_at_home.prime;

public class PrimeUtils {

	public static boolean isPrime(int i) {

		if (i % 2 == 0) return false;

		for (int j = 3; j * j < i; j += 2) {
			if (i % j == 0) return false;
		}

		return true;

	}

}
