package main.lesson170830.teacherworkinclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RaceConditionExample2 {

	public static class Modifier implements Runnable  {

		private Model model;

		public Modifier(final Model model) {
			this.model = model;
		}

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				model.change(i);
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("start");

		Model model = new Model();

		Modifier task = new Modifier(model);

		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(task);
		service.execute(task);
		service.execute(task);

		service.shutdown();

		service.awaitTermination(1, TimeUnit.HOURS);

		model.check();

		System.out.println("finish: " + model);


	}

}
