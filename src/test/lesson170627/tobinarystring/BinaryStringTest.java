package lesson170627.tobinarystring;


import main.lesson170627.myworkathome.tobinarystring.BinaryStringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryStringTest {

	@Test
	public void testBinaryString() {

		assertEquals("1010", BinaryStringUtils.toPrintBinaryString(10));
		assertEquals("11111111111111111111111111110110", BinaryStringUtils.toPrintBinaryString(-10));
		assertEquals("1111111111111111111111111111111", BinaryStringUtils.toPrintBinaryString(Integer.MAX_VALUE));
		assertEquals("10000000000000000000000000000000", BinaryStringUtils.toPrintBinaryString(Integer.MIN_VALUE));

		assertNotEquals("0100100110101", BinaryStringUtils.toPrintBinaryString(2352));
		assertNotEquals("11111110100110001110010001000111", BinaryStringUtils.toPrintBinaryString(-23534522));
		assertNotEquals("1111111111111111111111111111110", BinaryStringUtils.toPrintBinaryString(Integer.MAX_VALUE));
		assertNotEquals("11000000000000000000000000000000", BinaryStringUtils.toPrintBinaryString(Integer.MIN_VALUE));

	}

}
