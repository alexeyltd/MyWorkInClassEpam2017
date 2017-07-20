package main.lesson170719.teacherworkinclass.interfaces.examples;

public class RunnableExamples {

	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("hello");
		}
	}

	public static void main(String[] args) {

		Thread thread = new Thread(new Task());

		thread.start();

	}

}
