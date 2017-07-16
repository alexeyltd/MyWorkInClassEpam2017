package main.java.lesson170629.teacherworkinclass.staticclasses;

public class StaticInitSequence {


	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start");
		System.out.println(A.MAX);

		A a;

		Thread.sleep(3000);

		System.out.println(A.init());

		Thread.sleep(3000);

		System.out.println("create");

		a = new A();

	}

}
