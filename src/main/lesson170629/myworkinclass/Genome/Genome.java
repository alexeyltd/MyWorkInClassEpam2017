package main.lesson170629.myworkinclass.Genome;

public class Genome {

	public static void main(String[] args) {

		byte[] data = DataGenerator.generate(30);

//		System.out.println(Arrays.toString(data));

		for (byte b : data) {
			System.out.print((char) b);
		}

		findDuplicates(data, 4);

	}

	private static void findDuplicates(byte[] data, int i) {
		int counter = 0;
		for (int j = 0; j <= data.length - i; j++) {
			INNER:
			for (int k = j + 1; k < data.length - i + 1; k++) {
				for (int l = 0; l < i; l++) {
					if (data[j + l] != data[k + l]) {
						continue INNER;
					}
				}
//				System.out.println("hurray!");
//				System.out.println("j = " + j + " , k = " + k);
				counter++;
			}
		}
		System.out.println();
		System.out.println(counter);
	}

}
