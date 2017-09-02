package main.lesson170828.teacherworkinclass;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExamples {

	public static void main(String[] args) {

		System.out.println("start");

//		ExecutorService executorService = Executors.newSingleThreadExecutor();

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(() -> {
			System.out.println("Hello, world!");
			Utils.pause(1000);
		});

		executorService.execute(() -> {
			System.out.println("Hello, world!");
			Utils.pause(1000);
		});

		executorService.execute(() -> {
			System.out.println("Hello, world!");
			Utils.pause(1000);
		});

//		executorService.shutdown();

		List<Runnable> runnableList = executorService.shutdownNow();

		System.out.println(runnableList);

		System.out.println("finish");


	}

}
