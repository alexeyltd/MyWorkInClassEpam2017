package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class VisibilityAndVolatileExample {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Thread thread = new Thread(counter);

		thread.start();

		Utils.pause(5000);

		counter.shutDown();

	}

}

class Counter implements Runnable {

	volatile boolean stop;

	@Override
	public void run() {
		long count = 0;
		while (!stop) {
			count++;
		}
		System.out.println(count);
	}

	public void shutDown() {
		stop = true;
	}

}
