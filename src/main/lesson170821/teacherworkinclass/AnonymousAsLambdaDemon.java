package main.lesson170821.teacherworkinclass;

public class AnonymousAsLambdaDemon {

	public static void main(String[] args) {

		Runnable procedureOne = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello, world 1 !");
			}
		};

		Runnable procedureTwo = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello, world 2 !");
			}
		};

		process(procedureOne);
		process(procedureTwo);

		algorithm(procedureOne, procedureTwo);
	}

	private static void algorithm(final Runnable step1, final Runnable step2) {
		step1.run();
		step2.run();
	}

	private static void process(final Runnable procedure) {
		procedure.run();
	}

}
