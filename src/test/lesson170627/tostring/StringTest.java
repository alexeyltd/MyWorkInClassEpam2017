package lesson170627.tostring;

import main.lesson170627.myworkathome.tostring.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringTest {

	@Test
	public void testString() {

		assertEquals("10", StringUtils.toPrintString(10));
		assertEquals("100", StringUtils.toPrintString(100));
		assertEquals("1000", StringUtils.toPrintString(1000));
		assertEquals("2147483647", StringUtils.toPrintString(Integer.MAX_VALUE));
		assertEquals("-2147483648", StringUtils.toPrintString(Integer.MIN_VALUE));

		assertNotEquals("255", StringUtils.toPrintString(2555));
		assertNotEquals("21", StringUtils.toPrintString(213));
		assertNotEquals("245", StringUtils.toPrintString(6245));
		assertNotEquals("2147483648", StringUtils.toPrintString(Integer.MAX_VALUE));
		assertNotEquals("2147483648", StringUtils.toPrintString(Integer.MIN_VALUE));

	}

}
