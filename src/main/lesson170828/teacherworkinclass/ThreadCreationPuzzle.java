package main.lesson170828.teacherworkinclass;

public class ThreadCreationPuzzle {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("haha")) {
			@Override
			public void run() {
				System.out.println("hoho");
			}
		}.start();

	}

}
