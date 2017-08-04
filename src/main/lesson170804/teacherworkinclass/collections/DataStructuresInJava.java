package main.lesson170804.teacherworkinclass.collections;

import java.util.*;

public class DataStructuresInJava {

	public static void main(String[] args) {

		int x = 0;
		String s = "hello";

		int[] a = new int[10];

		Object[] objects = new Object[0];

		Stack<String> stack = new Stack<>();
		stack.push("one");

		List<Number> list = Arrays.asList(1, 1.3);
		List<Number> linked = new LinkedList() {

			{
				add(1);
			}

		};

		Queue<String> queue = new ArrayDeque<>();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		Map<String, Integer> wordCount1 = new HashMap<>();
		Map<String, Integer> wordCount2 = new LinkedHashMap<>();
		Map<String, Integer> wordCount3 = new TreeMap<>();




	}

}
