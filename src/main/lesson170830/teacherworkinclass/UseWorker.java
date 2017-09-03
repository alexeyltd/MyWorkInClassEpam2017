package main.lesson170830.teacherworkinclass;

import java.util.List;

public class UseWorker {

	public static void main(String[] args) {

		Worker worker = new Worker();

		worker.execute(() -> {
			System.out.print("hello");
		});

		worker.execute(() -> {
			System.out.println(" world!");
		});

		worker.execute(() -> {
			System.out.println(" world!");
		});

		worker.execute(() -> {
			System.out.println(" world!");
		});

		worker.execute(() -> {
			System.out.println(" world!");
		});

		worker.execute(() -> {
			System.out.println(" world!");
		});

		BlockingQueue<Runnable> runnables = worker.shutDownNow();

		System.out.println(runnables);

		worker.execute(() -> {
			System.out.println(" world!");
		});
		worker.execute(() -> {
			System.out.println(" world!");
		});

	}

}
