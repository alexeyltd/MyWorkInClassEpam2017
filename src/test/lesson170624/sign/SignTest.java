package lesson170624.sign;

import main.lesson170624.myworkathome.sign.SignUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class SignTest {

	@Test
	public void testSign() {

		assertEquals(1, SignUtils.sign(1));
		assertEquals(1, SignUtils.sign(50));
		assertEquals(-1, SignUtils.sign(-120));
		assertEquals(-1, SignUtils.sign(-178));
		assertEquals(0, SignUtils.sign(0));
		assertEquals(1, SignUtils.sign(Integer.MAX_VALUE));
		assertEquals(-1, SignUtils.sign(Integer.MIN_VALUE));

		assertNotEquals(0, SignUtils.sign(1));
		assertNotEquals(-1, SignUtils.sign(67));
		assertNotEquals(0, SignUtils.sign(-234));
		assertNotEquals(1, SignUtils.sign(0));
		assertNotEquals(-1, SignUtils.sign(435));
		assertNotEquals(0, SignUtils.sign(Integer.MAX_VALUE));
		assertNotEquals(1, SignUtils.sign(Integer.MIN_VALUE));



	}


}
