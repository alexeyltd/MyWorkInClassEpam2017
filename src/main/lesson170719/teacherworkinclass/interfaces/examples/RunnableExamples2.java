package main.lesson170719.teacherworkinclass.interfaces.examples;

public class RunnableExamples2 {

	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("hello");
		};

		Thread thread = new Thread(task);

		thread.start();

	}

}
