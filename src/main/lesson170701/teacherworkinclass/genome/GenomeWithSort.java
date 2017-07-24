package main.lesson170701.teacherworkinclass.genome;

import main.lesson170629.myworkinclass.Genome.DataGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class GenomeWithSort {

	private static final int GENOME_SIZE = 300000;
	private static final int WORD_SIZE = 4;

	static class Word implements Comparable<Word> {

		byte[] data;
		int offset;

		public Word(byte[] data, int i) {
			this.data = data;
			this.offset = i;
		}

		@Override
		public int compareTo(@NotNull Word otherWord) {

			for (int i = 0; i < WORD_SIZE; i++) {
				int diff = data[offset + i] - data[otherWord.offset + i];
				if (diff != 0) {
					return diff;
				}
			}

			return 0;
		}

		@Override
		public String toString() {
			return "Word{" +
					"data=" + Arrays.toString(data) +
					", offset=" + offset +
					'}';
		}
	}

	public static void main(String[] args) {

//		Stopwatch stopwatch = Stopwatch.createStarted();

		byte[] data = DataGenerator.generate(GENOME_SIZE);

		List<Word> list = new ArrayList<>();

		for (int i = 0; i < data.length - WORD_SIZE; i++) {

			list.add(new Word(data, i));

		}

		Collections.sort(list);

//		stopwatch.stop();

//		long millis = stopwatch.elapsed(MILLISECONDS);

//		System.out.println("time: " + stopwatch);

		Set<Word> uniqueSet = new HashSet<Word>(list);

		for (Word word : uniqueSet) {
			System.out.println(word + ": " + Collections.frequency(list, word));
		}


	}

}
