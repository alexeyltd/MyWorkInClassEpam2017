package lesson170627.tohexstring;

import main.lesson170627.myworkathome.tohexstring.HexStringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class HexStringTest {

	@Test
	public void testHexString() {

		assertEquals("0000000A", HexStringUtils.toPrintHexString(10));
		assertEquals("000001F4", HexStringUtils.toPrintHexString(500));
		assertEquals("FFFFF6DA", HexStringUtils.toPrintHexString(-2342));
		assertEquals("7FFFFFFF", HexStringUtils.toPrintHexString(Integer.MAX_VALUE));
		assertEquals("80000000", HexStringUtils.toPrintHexString(Integer.MIN_VALUE));


		assertNotEquals("000005D9", HexStringUtils.toPrintHexString(1241));
		assertNotEquals("FFFFFF5", HexStringUtils.toPrintHexString(-24411));
		assertNotEquals("8FFFFFFF", HexStringUtils.toPrintHexString(Integer.MAX_VALUE));
		assertNotEquals("81000000", HexStringUtils.toPrintHexString(Integer.MIN_VALUE));

	}

}
