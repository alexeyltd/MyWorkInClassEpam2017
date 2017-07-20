package lesson170627.tooctalstring;

import main.lesson170627.myworkathome.tooctalstring.OctalStringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class OctalStringTest {

	@Test
	public void testOctalString() {

		assertEquals("00000000252", OctalStringUtils.toPrintOctalString(170));
		assertEquals("00000000064", OctalStringUtils.toPrintOctalString(52));
		assertEquals("17777777777", OctalStringUtils.toPrintOctalString(Integer.MAX_VALUE));
		assertEquals("20000000000", OctalStringUtils.toPrintOctalString(Integer.MIN_VALUE));

		assertNotEquals("175", OctalStringUtils.toPrintOctalString(124));
		assertNotEquals("37777777424", OctalStringUtils.toPrintOctalString(-235));
		assertNotEquals("11777777777", OctalStringUtils.toPrintOctalString(Integer.MAX_VALUE));
		assertNotEquals("22000000000", OctalStringUtils.toPrintOctalString(Integer.MIN_VALUE));


	}

}
