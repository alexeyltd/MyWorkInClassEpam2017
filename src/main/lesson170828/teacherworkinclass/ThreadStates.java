package main.lesson170828.teacherworkinclass;

public class ThreadStates {

	public static void main(String[] args) throws InterruptedException {

		for (Thread.State state : Thread.State.values()) {
			System.out.println(state);
		}

		System.out.println();

		Thread thread = new Thread(() -> {
			while (true) {}
		});


		System.out.println(thread.getState());

		thread.start();

		System.out.println(thread.getState());

		Thread thread2 = new Thread(() -> {
			System.out.println(Thread.currentThread());
			Utils.pause(5000);
		});

		Thread main = Thread.currentThread();

		System.out.println(main.toString());

		thread2.start();

		System.out.println("joining...");

		thread2.join();

		System.out.println("joined!");

		System.out.println(thread2.getState());


	}

}
