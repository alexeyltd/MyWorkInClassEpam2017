package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class WaitNotifyExample {

	public static void main(String[] args) {

		Object monitor = new Object();

		Thread thread = new Thread(() -> {
			System.err.println("trying to get monitor...");
			synchronized (monitor) {
				System.err.println("locked!");
				try {
					monitor.wait();
					System.err.println("we are notified!");

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();

		Utils.pause(4000);


		synchronized (monitor) {
			System.out.println("send notify...");
			monitor.notify();
			System.out.println("sleeping...");
			Utils.pause(4000);
			System.out.println("awoke!");

		}

	}

}
