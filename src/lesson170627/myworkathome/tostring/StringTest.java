package lesson170627.myworkathome.tostring;

public class StringTest {

	public static void main(String[] args) {

		System.out.println(StringUnit.assertEquals(StringUtils.toPrintString(10), "10"));
		System.out.println(StringUnit.assertEquals(StringUtils.toPrintString(100), "100"));
		System.out.println(StringUnit.assertEquals(StringUtils.toPrintString(1000), "1000"));
		System.out.println(StringUnit.assertEquals(StringUtils.toPrintString(Integer.MAX_VALUE), "2147483647"));
		System.out.println(StringUnit.assertEquals(StringUtils.toPrintString(Integer.MIN_VALUE), "-2147483648"));

		System.out.println(StringUnit.assertNotEquals(StringUtils.toPrintString(2555), "255"));
		System.out.println(StringUnit.assertNotEquals(StringUtils.toPrintString(213), "21"));
		System.out.println(StringUnit.assertNotEquals(StringUtils.toPrintString(6245), "245"));
		System.out.println(StringUnit.assertNotEquals(StringUtils.toPrintString(Integer.MAX_VALUE), "2147483648"));
		System.out.println(StringUnit.assertNotEquals(StringUtils.toPrintString(Integer.MIN_VALUE), "2147483648"));


		System.out.println(StringUnit.assertEquals(StringUtils.toPrintStringWithBase(10, 2), "0000000A"));
	}

}
