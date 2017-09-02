package main.lesson170828.teacherworkinclass;

public class DaemonExample {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {

			while (true) {

				Utils.pause(1000);
				System.out.println("here");

			}

		});

		thread.setDaemon(true);

		thread.start();

		System.out.println(thread.isAlive());

		System.out.println("continue....");

		Utils.pause(5000);

		System.out.println("finish");

	}

}
