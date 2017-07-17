package lesson170624.mod;

import main.lesson170624.myworkathome.mod.ModUtils;
import org.junit.Test;
import static org.junit.Assert.*;


public class ModTest {

	@Test
	public void testMode() {

		assertEquals(1, ModUtils.mod(1, 3));
		assertEquals(211, ModUtils.mod(-45, 256));
		assertEquals(0, ModUtils.mod(432, -54));
		assertEquals(1, ModUtils.mod(1, 3));
		assertEquals(360, ModUtils.mod(Integer.MIN_VALUE, 856));
		assertEquals(97, ModUtils.mod(Integer.MAX_VALUE, 150));

		assertNotEquals(23, ModUtils.mod(45, 856));
		assertNotEquals(-42, ModUtils.mod(-345, 234));
		assertNotEquals(12, ModUtils.mod(67, 23));
		assertNotEquals(124, ModUtils.mod(Integer.MAX_VALUE, 123));
		assertNotEquals(123, ModUtils.mod(Integer.MIN_VALUE, 1224));

	}

}
