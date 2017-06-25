package lesson170624.my_work_at_home.isfibonacci;


public class FibonacciUtils {

	private static boolean isPerfectSquare(double x) {
		double s = Math.sqrt(x);
		return (s * s == x);
	}

	public static boolean isFibonacci(double i) {

		return isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4);

	}
}
