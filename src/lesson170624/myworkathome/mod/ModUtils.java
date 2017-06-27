package lesson170624.myworkathome.mod;

public class ModUtils {

	public static int mod(int i, int j) {

		int result = i - (i / j) * j;

		return (result < 0) ? result + Math.abs(j) : result;

	}

}
