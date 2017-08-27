package main.lesson170825.teacherworkinclass;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveStreamExamples {

	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(1, 10);

		printStats(intStream);


	}

	private static void printStats(final IntStream intStream) {

//		OptionalDouble average = intStream.average();

		IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

		System.out.println(intSummaryStatistics);


	}

}
