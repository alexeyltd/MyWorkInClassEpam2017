package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class InterruptExample2 {

	public static void main(String[] args) {

		Counter2 counter = new Counter2();

		Thread thread = new Thread(counter);

		thread.start();

		Utils.pause(5000);

		counter.shutDown();

	}

}

class Counter2 implements Runnable {

	private Thread currentThread;

	@Override
	public void run() {
		currentThread = Thread.currentThread();
		long count = 0;
		while (!Thread.interrupted()) {
			count++;
		}
		System.out.println(count);
	}

	public void shutDown() {
		currentThread.interrupt();
	}

}

