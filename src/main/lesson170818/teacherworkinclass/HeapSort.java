package main.lesson170818.teacherworkinclass;

import java.util.*;

public class HeapSort {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("one");
		list.add("zero");
		list.add("three");
		list.add("five");
		list.add("two");
		List<String> sorted = heapSort(list);
		System.out.println(sorted);

	}

	private static List<String> heapSort(final List<String> list) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		for (String string : list) {
			priorityQueue.add(string);
		}
		List<String> result = new ArrayList<>();
		while (!priorityQueue.isEmpty()) {
			result.add(priorityQueue.poll());
		}
		return result;
	}


}
