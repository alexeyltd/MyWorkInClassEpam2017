package lesson170627.myworkathome.tohexstring;

public class HexStringUtils {

	public static String toPrintHexString(int i) {
		String codes = "0123456789ABCDEF";

		StringBuilder builder = new StringBuilder(8);

		builder.setLength(8);

		for (int j = 7; j >= 0; j--) {
			builder.setCharAt(j, codes.charAt(i & 0xF));
			i >>= 4;
		}

		return builder.toString();
	}

}
