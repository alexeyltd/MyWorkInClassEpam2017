package main.lesson170828.teacherworkinclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExamples {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

		ExecutorService realService = Executors.newCachedThreadPool();

		scheduledExecutorService.execute(() -> {
			System.out.println("hello!");
		});

		scheduledExecutorService.schedule(() -> {
			System.out.println("hi there!");
		}, 5, TimeUnit.SECONDS);

//		the same time without delay between task
		scheduledExecutorService.scheduleAtFixedRate(() -> {
			realService.execute(() -> System.out.println("hey from real fixed rate"));
		}, 1, 1,  TimeUnit.SECONDS);

//		between tasks we have a delay
		scheduledExecutorService.scheduleWithFixedDelay(() -> {
			realService.execute(() -> System.out.println("hey from real fixed delay"));
		}, 1, 1,  TimeUnit.SECONDS);

	}

}
