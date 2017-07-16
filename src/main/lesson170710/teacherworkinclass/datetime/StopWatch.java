package main.lesson170710.teacherworkinclass.datetime;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {

	public static void main(String[] args) throws InterruptedException {

		Instant start = Instant.now();

		Thread.sleep(1000);

		Instant stop = Instant.now();

		Duration elapsed = Duration.between(start, stop);

		System.out.println(elapsed.getSeconds());


	}

}
