package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class BlockingAndWaitingStatesExample {

	public static void main(String[] args) {

		Object monitor = new Object();

		Thread thread = new Thread(() -> {
			System.err.println("trying to get monitor...");
			synchronized (monitor) {
				System.err.println("locked!");
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		synchronized (monitor) {
			System.out.println("starting another thread...");
			thread.start();

			System.out.println("sleeping...");
			Utils.pause(5000);
			System.out.println(thread.getState());
			System.out.println("awoke!");
		}

	}

}
