package lesson170627.teacherworkinclass.primitive;

public class PrimitiveTypes {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);

		long l = 2147483647L;

		int x = 0xff; // 16ми
		int o = 077; // 8ми
		int b = 0b11;


		System.out.println((char) 65);

		long l2 = 100;

		int i2 = (int) l2;

		double d = 10;

		System.out.println(d);

		int i3 = (int) d;

		System.out.println(x);

		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toOctalString(x));

	}

}
