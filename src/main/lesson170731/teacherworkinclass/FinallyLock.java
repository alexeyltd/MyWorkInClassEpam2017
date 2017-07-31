package main.lesson170731.teacherworkinclass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyLock {

	static class Counter {

		Lock lock = new ReentrantLock();

		int count;

		public void inc() {

			lock.lock();
			try {
				count++;
			} finally {
				lock.unlock();
			}

		}

		public int get() {
			lock.lock();
			try {
				return count;
			} finally {
				lock.unlock();
			}
		}

	}

	public static void main(String[] args) {

		Counter counter = new Counter();

		Runnable runnable = () -> {
			while (true) {
				counter.inc();
				System.out.println(counter.get());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		new Thread(runnable).start();

		new Thread(runnable).start();


	}

}
