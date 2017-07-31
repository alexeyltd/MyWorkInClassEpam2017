package main.lesson170731.teacherworkinclass;

import java.util.Random;

public class MultiCatchExample {

	public static void main(String[] args) {

		System.out.println("start");

		try	{
			process();
		} catch (IllegalArgumentException | NullPointerException | ArithmeticException exception) {
			System.err.println(exception.getClass().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("finish");

	}

	private static void process() {
		Random random = new Random();

		int state = random.nextInt(3);

		switch (state) {
			case 0:
				throw new IllegalArgumentException();
			case 1:
				throw new NullPointerException();
			case 2:
				throw new ArithmeticException();
		}
	}

}
