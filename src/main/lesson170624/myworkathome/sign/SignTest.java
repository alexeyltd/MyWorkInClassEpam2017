package main.lesson170624.myworkathome.sign;

public class SignTest {

	public static void main(String[] args) {


		System.out.println(SignUnit.assertEquals(SignUtils.sign(1), 1));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(50), 1));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(-120), -1));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(-178), -1));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(0), 0));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(Integer.MAX_VALUE), 1));
		System.out.println(SignUnit.assertEquals(SignUtils.sign(Integer.MIN_VALUE), -1));


		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(1), 0));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(67), -1));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(-234), 0));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(0), 1));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(435), -1));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(Integer.MAX_VALUE), 0));
		System.out.println(SignUnit.assertNotEquals(SignUtils.sign(Integer.MIN_VALUE), 1));

	}

}
