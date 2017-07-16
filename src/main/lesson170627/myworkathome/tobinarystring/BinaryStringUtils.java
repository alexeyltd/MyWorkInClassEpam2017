package main.lesson170627.myworkathome.tobinarystring;

public class BinaryStringUtils {

	public static String toPrintBinaryString(int i) {
		if (i == 0) {
			return "0";
		}
		StringBuilder stringBuilder = new StringBuilder(32);
		while (i != 0) {
			stringBuilder.append(i & 1);
			i >>>= 1;
		}
		return stringBuilder.reverse().toString();
	}


}
