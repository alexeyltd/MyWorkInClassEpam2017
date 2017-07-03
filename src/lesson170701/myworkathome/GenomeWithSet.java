package lesson170701.myworkathome;

import com.google.common.base.Stopwatch;
import lesson170629.myworkinclass.DataGenerator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class GenomeWithSet {

	private static final int GENOME_SIZE = 10;
	private static final int WORD_SIZE = 4;

	static class Word {

		byte[] data;

		public Word(byte[] data) {
			this.data = data;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			Word word = (Word) o;

			return Arrays.equals(data, word.data);
		}

		@Override
		public int hashCode() {
			return Arrays.hashCode(data);
		}

		@Override
		public String toString() {
			return "Word{" +
					"data=" + Arrays.toString(data) +
					'}';
		}

	}

	public static void main(String[] args) {

		Stopwatch stopwatch = Stopwatch.createStarted();

		byte[] data = DataGenerator.generate(GENOME_SIZE);

		Set<Word> wordSet = new HashSet<>();

		int countRepeat = 0;

		for (int i = 0; i < data.length; i++) {
			Word word = new Word(Arrays.copyOfRange(data, i, i + WORD_SIZE));
			if (wordSet.add(word)) {
				continue;
			}
			countRepeat++;
		}

		stopwatch.stop();

		long millis = stopwatch.elapsed(MILLISECONDS);

		System.out.println("time: " + stopwatch);

		System.out.println(countRepeat);

		for (Word word : wordSet) {
			System.out.println(Arrays.toString(new Word[]{word}));
		}


	}

}
