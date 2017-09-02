package main.lesson170828.teacherworkinclass;

public class GetMainThreadExample {

	public static void main(String[] args) {

		new Thread(() -> {

			Thread thread = Thread.currentThread();

			ThreadGroup threadGroup = thread.getThreadGroup();

			Thread[] threads = new Thread[threadGroup.activeCount()];

			threadGroup.enumerate(threads);

			for (Thread thread1 : threads) {
				System.out.println(thread);
			}

		}).start();

		Utils.pause(3000);

	}

}
