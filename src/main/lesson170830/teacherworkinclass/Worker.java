package main.lesson170830.teacherworkinclass;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.Executor;

public class Worker implements Executor {

	public static final Runnable POISON_PILE = () -> {};

	private final BlockingQueue<Runnable> tasks = new BlockingQueue<>();

	private volatile boolean stop;

	public Worker() {
		new Thread(this::processTasks).start();
	}

	@Override
	public void execute(@NotNull final Runnable command) {
		if (stop != true) {
			tasks.put(command);
		}
	}

	private void processTasks() {
		while (true) {
			Runnable task = tasks.take();
			if (task == POISON_PILE) {
				return;
			}
			Optional.ofNullable(task).ifPresent(Runnable::run);
		}
	}

	public void shutDown() {
		tasks.put(POISON_PILE);
		stop = true;
	}

	public List<Runnable> shutDownNow() {


		return null;
	}

}
