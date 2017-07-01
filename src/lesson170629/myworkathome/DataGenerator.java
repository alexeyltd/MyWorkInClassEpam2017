package lesson170629.myworkathome;


import java.util.Random;

public class DataGenerator {

	static final byte[] ALPHOBET = {
			'A', 'C', 'G', 'T'
	};

	public static byte[] generate(int size) {

		byte[] data = new byte[size];

		Random random = new Random();

		for (int i = 0; i < data.length; i++) {
			int letterIndex = random.nextInt(ALPHOBET.length);
			data[i] = ALPHOBET[letterIndex];
		}

		return data;

	}

}
