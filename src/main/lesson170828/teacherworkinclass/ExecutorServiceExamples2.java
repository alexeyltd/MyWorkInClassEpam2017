package main.lesson170828.teacherworkinclass;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExamples2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("start");

//		ExecutorService executorService = Executors.newSingleThreadExecutor();

//		ExecutorService executorService = Executors.newFixedThreadPool(2);

		ExecutorService executorService = Executors.newCachedThreadPool();


		for (int i = 1; i <= 5; i++) {
			int tmp = i;
			executorService.execute(() -> {
				System.out.println("Begin work... " + tmp);
				Utils.pause(3000);
				System.out.println("Hello, world " + tmp);

			});
		}

		executorService.shutdown();

		boolean awaitTermination = executorService.awaitTermination(1, TimeUnit.HOURS);

		System.out.println("finish " + awaitTermination);



	}

}
