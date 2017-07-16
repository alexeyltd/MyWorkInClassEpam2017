package main.java.lesson170627.myworkathome.tobinarystring;


public class BinaryStringTest {

	public static void main(String[] args) {

		System.out.println(Integer.toBinaryString(-23534522));

		System.out.println(BinaryStringUnit.assertEquals(BinaryStringUtils.toPrintBinaryString(10), "1010"));
		System.out.println(BinaryStringUnit.assertEquals(BinaryStringUtils.toPrintBinaryString(-10), "11111111111111111111111111110110"));
		System.out.println(BinaryStringUnit.assertEquals(BinaryStringUtils.toPrintBinaryString(Integer.MAX_VALUE), "1111111111111111111111111111111"));
		System.out.println(BinaryStringUnit.assertEquals(BinaryStringUtils.toPrintBinaryString(Integer.MIN_VALUE), "10000000000000000000000000000000"));

		System.out.println(BinaryStringUnit.assertNotEquals(BinaryStringUtils.toPrintBinaryString(2352), "0100100110101"));
		System.out.println(BinaryStringUnit.assertNotEquals(BinaryStringUtils.toPrintBinaryString(-23534522), "11111110100110001110010001000111"));
		System.out.println(BinaryStringUnit.assertNotEquals(BinaryStringUtils.toPrintBinaryString(Integer.MAX_VALUE), "1111111111111111111111111111110"));
		System.out.println(BinaryStringUnit.assertNotEquals(BinaryStringUtils.toPrintBinaryString(Integer.MIN_VALUE), "11000000000000000000000000000000"));

	}

}
