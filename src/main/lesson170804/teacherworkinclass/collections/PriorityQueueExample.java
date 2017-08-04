package main.lesson170804.teacherworkinclass.collections;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {

	private static final int MAX = 1000000;

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(0);
		priorityQueue.add(5);
		priorityQueue.add(-3);
		priorityQueue.add(40);

		Integer poll = priorityQueue.poll();

		System.out.println(poll);

		Random random = new Random();
		for (int i = 0; i < MAX; i++) {
			priorityQueue.add(random.nextInt(1000000));
			if (priorityQueue.size() > 10) {
				priorityQueue.poll();
			}
		}

		System.out.println(priorityQueue);

	}

}
