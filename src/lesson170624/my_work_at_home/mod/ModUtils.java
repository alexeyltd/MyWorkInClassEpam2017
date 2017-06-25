package lesson170624.my_work_at_home.mod;

public class ModUtils {

	public static int mod(int i, int j) {

		int result = i - (i / j) * j;

		return (result < 0) ? result + Math.abs(j) : result;

	}

}
