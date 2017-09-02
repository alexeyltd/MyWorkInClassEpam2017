package main.lesson170828.teacherworkinclass;

public class ThreadCreationExample {

	public static final Runnable Task = () -> {
		System.out.println("Hello, world! I am a parameter");
	};

	public static void main(String[] args) {

		new Thread(Task).start();

		new Thread() {
			@Override
			public void run() {
				System.out.println("Hello, world! I am an anonymous");
			}
		}.start();

		new MyThread().start();

	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Hello, my thread!");
	}

}


