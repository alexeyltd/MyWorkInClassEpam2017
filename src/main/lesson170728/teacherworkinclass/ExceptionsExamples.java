package main.lesson170728.teacherworkinclass;

public class ExceptionsExamples {

	public static void main(String[] args) {

		System.out.println("start");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("stop");


	}

}
