package lesson170624.my_work_at_home.sign;

public class SignUtils {

	public static int sign(int i) {
		if (i < 0) {
			return -1;
		} else if (i > 0) {
			return 1;
		}
		return 0;
	}

}
