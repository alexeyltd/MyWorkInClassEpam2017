package main.lesson170830.teacherworkinclass;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

	private final Queue<T> items = new LinkedList<>();

	public void put(T item) {
		synchronized (items) {
			items.offer(item);
			items.notify();
		}
	}

	public T take() {
		synchronized (items) {
			while (items.isEmpty()) { // spurious wake-up
				try {
					items.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			return items.poll();
		}
	}

	@Override
	public String toString() {
		return "BlockingQueue{" +
				"items=" + items +
				'}';
	}
}
