package lesson170627.myworkathome.tooctalstring;


public class OctalStringUtils {

	public static String toPrintOctalString(int i) {
		String codes = "01234567";

		StringBuilder builder = new StringBuilder(11);

		builder.setLength(11);

		for (int j = 10; j >= 0; j--) {
			builder.setCharAt(j, codes.charAt(Math.abs(i % 8)));
			i >>>= 3;
		}

		return builder.toString();
	}

}
