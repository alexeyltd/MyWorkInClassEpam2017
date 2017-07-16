package main.lesson170627.myworkathome.tooctalstring;

public class OctalStringTest {

	public static void main(String[] args) {

		System.out.println(OctalStringUnit.assertEquals(OctalStringUtils.toPrintOctalString(170), "00000000252"));
		System.out.println(OctalStringUnit.assertEquals(OctalStringUtils.toPrintOctalString(52), "00000000064"));
		System.out.println(OctalStringUnit.assertEquals(OctalStringUtils.toPrintOctalString(Integer.MAX_VALUE), "17777777777"));
		System.out.println(OctalStringUnit.assertEquals(OctalStringUtils.toPrintOctalString(Integer.MIN_VALUE), "20000000000"));

		System.out.println(OctalStringUnit.assertNotEquals(OctalStringUtils.toPrintOctalString(124), "175"));
		System.out.println(OctalStringUnit.assertNotEquals(OctalStringUtils.toPrintOctalString(-235), "37777777424"));
		System.out.println(OctalStringUnit.assertNotEquals(OctalStringUtils.toPrintOctalString(Integer.MAX_VALUE), "11777777777"));
		System.out.println(OctalStringUnit.assertNotEquals(OctalStringUtils.toPrintOctalString(Integer.MIN_VALUE), "22000000000"));


	}

}
