package lesson170624.mywork;

public class Max {

	public static void main(String[] args) {

//		Equals max
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(10, 30), 30));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(2000, 3000), 3000));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.max(5000, 300), 5000));

//		Not equals max
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(30, 10), 10));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(100, 600), 100));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.max(5000, 10000), 5000));

//		Equals min
		System.out.println(SimpleUnit.assertEquals(MathsUtils.min(5, 7), 5));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.min(300, 1), 1));
		System.out.println(SimpleUnit.assertEquals(MathsUtils.min(3000, 5000), 3000));

//		Not equals min
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.min(40, 100), 100));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.min(550, 560), 560));
		System.out.println(SimpleUnit.assertNotEquals(MathsUtils.min(3450, 5450), 5450));

	}

}
