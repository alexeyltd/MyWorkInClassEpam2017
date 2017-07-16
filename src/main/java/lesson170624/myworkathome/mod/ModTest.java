package main.java.lesson170624.myworkathome.mod;

public class ModTest {

	public static void main(String[] args) {

//		Only positive result
		System.out.println(ModUnit.assertEquals(ModUtils.mod(1, 3), 1));
		System.out.println(ModUnit.assertEquals(ModUtils.mod(-45, 256), 211));
		System.out.println(ModUnit.assertEquals(ModUtils.mod(432, -54), 0));
		System.out.println(ModUnit.assertEquals(ModUtils.mod(-67, -34), 1));
		System.out.println(ModUnit.assertEquals(ModUtils.mod(Integer.MAX_VALUE, 150), 97));
		System.out.println(ModUnit.assertEquals(ModUtils.mod(Integer.MIN_VALUE, 856), 360));


		System.out.println(ModUnit.assertNotEquals(ModUtils.mod(45, 856), 23));
		System.out.println(ModUnit.assertNotEquals(ModUtils.mod(-345, 234), -42));
		System.out.println(ModUnit.assertNotEquals(ModUtils.mod(67, 23), 12));
		System.out.println(ModUnit.assertNotEquals(ModUtils.mod(Integer.MAX_VALUE, 123), 124));
		System.out.println(ModUnit.assertNotEquals(ModUtils.mod(Integer.MIN_VALUE, 1224), 123));

	}

}
