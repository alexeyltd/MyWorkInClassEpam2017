package main.java.lesson170714.teacherworkinclass.inheritancetwo;

import java.util.Random;

public class Linkage {

	static class Processor {

		int process(int[] a) {

			int sum = 0;

			for (int value : a) {
				sum += value;
			}

			return sum;
		}

	}

	static class AnotherProcessor extends Processor {

		@Override
		int process(int[] a) {
			int sum = super.process(a);
			return -sum;
		}
	}

	static Processor processor;

	static {
		Random r = new Random();
		processor = r.nextBoolean() ? new Processor() : new AnotherProcessor();
	}

	public static void main(String[] args) {

		int[] a = {0, 1, 2, 3};

		int result = process(a);

		int alter = processor.process(a);

	}

	private static int process(int[] a) {

		int sum = 0;

		for (int value : a) {
			sum += value;
		}

		return sum;
	}

}
