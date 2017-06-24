package lesson170624.mywork;

// Class for test maximus values
public class Max {

	public static void main(String[] args) {

//		Equals max
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(10, 30), 30));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(2000, 3000), 3000));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

//		Not equals max
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(30, 10), 10));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(100, 600), 100));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));

	}

}
