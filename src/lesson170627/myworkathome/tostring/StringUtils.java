package lesson170627.myworkathome.tostring;

import lesson170627.myworkathome.tobinarystring.BinaryStringUtils;
import lesson170627.myworkathome.tohexstring.HexStringUtils;
import lesson170627.myworkathome.tooctalstring.OctalStringUtils;

public class StringUtils {


	public static String toPrintString(int i) {
		return "" + i;
	}

	public static String toPrintStringWithBase(int i, int j) {
		if (j == 2) {
			return HexStringUtils.toPrintHexString(i);
		} else if (j == 8) {
			return BinaryStringUtils.toPrintBinaryString(i);
		} else if (j == 16) {
			return OctalStringUtils.toPrintOctalString(i);
		} else {
			return "Please choose 2 / 8 / 16 in second parametr";
		}
	}
}
