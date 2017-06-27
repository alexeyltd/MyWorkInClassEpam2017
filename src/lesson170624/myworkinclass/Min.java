package lesson170624.myworkinclass;

import lesson170624.myworkinclass.mytestframework.Asserts;

// Class for test minimus values
public class Min {

	public static void main(String[] args) {

//		Equals min
		System.out.println(Asserts.assertEquals(MathsUtils.min(5, 7), 5));
		System.out.println(Asserts.assertEquals(MathsUtils.min(300, 1), 1));
		System.out.println(Asserts.assertEquals(MathsUtils.min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));

//		Not equals min
		System.out.println(Asserts.assertNotEquals(MathsUtils.min(40, 100), 100));
		System.out.println(Asserts.assertNotEquals(MathsUtils.min(550, 560), 560));
		System.out.println(Asserts.assertNotEquals(MathsUtils.min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));

	}

}
