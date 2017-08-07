package main.lesson170807.teacherworkinclass;


import org.apache.commons.lang.time.StopWatch;

import java.util.*;
import java.util.Collections;

public class ArrayListVSLinkedLIst {

	private static final int MAX = 1_000_000;
	private static Random random = new Random();

	public static void main(String[] args) {
		List<Integer> arrayBased = new ArrayList<>();
		List<Integer> linkBased = new LinkedList<>();

		fill(arrayBased);
		fill(linkBased);

		arrayBased.clear();
		linkBased.clear();

		fillByInsertion(arrayBased);
		fillByInsertion(linkBased);
	}

	private static void fill(final List<Integer> list) {
		StopWatch watch = new StopWatch();
		watch.start();
		for (int i = 0; i < MAX; i++) {
			list.add(random.nextInt());
		}
		watch.stop();
		System.out.println("Time : " + watch.getTime());
	}

	private static void fillByInsertion(final List<Integer> list) {
		StopWatch watch = new StopWatch();
		watch.start();
		for (int i = 0; i < MAX; i++) {
			list.add(0, random.nextInt());
		}
		watch.stop();
		System.out.println("Time : " + watch.getTime());
	}

}
