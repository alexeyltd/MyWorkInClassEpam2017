package main.lesson170627.myworkathome.tohexstring;

public class HexStringTest {

	public static void main(String[] args) {

		System.out.println(HexStringUnit.assertEquals(HexStringUtils.toPrintHexString(10), "0000000A"));
		System.out.println(HexStringUnit.assertEquals(HexStringUtils.toPrintHexString(500), "000001F4"));
		System.out.println(HexStringUnit.assertEquals(HexStringUtils.toPrintHexString(-2342), "FFFFF6DA"));
		System.out.println(HexStringUnit.assertEquals(HexStringUtils.toPrintHexString(Integer.MAX_VALUE), "7FFFFFFF"));
		System.out.println(HexStringUnit.assertEquals(HexStringUtils.toPrintHexString(Integer.MIN_VALUE), "80000000"));

		System.out.println(HexStringUnit.assertNotEquals(HexStringUtils.toPrintHexString(1241), "000005D9"));
		System.out.println(HexStringUnit.assertNotEquals(HexStringUtils.toPrintHexString(-24411), "FFFFFF5"));
		System.out.println(HexStringUnit.assertNotEquals(HexStringUtils.toPrintHexString(Integer.MAX_VALUE), "8FFFFFFF"));
		System.out.println(HexStringUnit.assertNotEquals(HexStringUtils.toPrintHexString(Integer.MIN_VALUE), "81000000"));

	}

}
