package lesson170624.my_work_at_home.isfibonacci;

public class FibonacciTest {

	public static void main(String[] args) {


		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(1), true));
		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(987), true));
		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(6765), true));
		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(-26), false));
		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(Integer.MAX_VALUE), false));
		System.out.println(FibonacciUnit.assertEquals(FibonacciUtils.isFibonacci(Integer.MIN_VALUE), false));


		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(3224), false));
		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(3235235), false));
		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(235235), false));
		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(123), false));
		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(Integer.MAX_VALUE), true));
		System.out.println(FibonacciUnit.assertNotEquals(FibonacciUtils.isFibonacci(Integer.MIN_VALUE), true));

	}

}
