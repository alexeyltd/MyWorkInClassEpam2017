package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class InterruptExample {

	public static void main(String[] args) {

		System.gc();

		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		thread.start();

		Utils.pause(1000);

		thread.interrupt();

	}

}
