package main.lesson170830.teacherworkinclass;

public class RaceConditionExample {

	public static int count;

//	public static Object object = new Object();

	public static class Counter implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 1_000_000; i++) {
				synchronized (this) {
					count++;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Counter task = new Counter();

		Thread thread = new Thread(task);
		thread.start();

		Thread thread2 = new Thread(task);
		thread2.start();

		thread.join();
		thread2.join();

		System.out.println(count);

	}

}
