package main.lesson170818.teacherworkinclass;

import java.util.*;

public class TreeSetExample {

	private static final int MAX = 100;

	public static void main(String[] args) {

		Random random = new Random();

		TreeSet<Integer> set = new TreeSet<>();

		for (int i = 0; i < MAX; i++) {
			set.add(random.nextInt(MAX));
		}

		SortedSet<Integer> subSet =  set.subSet(20, 30);

		System.out.println(subSet);
	}

}
