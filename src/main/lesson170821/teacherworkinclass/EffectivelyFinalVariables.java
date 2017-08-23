package main.lesson170821.teacherworkinclass;

import a.e.T;

public class EffectivelyFinalVariables {

	public static int z = 1000;

	public static void main(String[] args) {

		final int x = 10;
		int y = 10;

		Runnable runnable = () -> {
			pause(25000);
			System.out.println(x + y);
		};

		new Thread(runnable).start();

		pause(10000);

		System.out.println("finish");

	}

	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
