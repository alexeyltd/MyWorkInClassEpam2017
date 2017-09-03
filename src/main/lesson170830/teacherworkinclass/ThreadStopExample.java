package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

import static main.lesson170830.teacherworkinclass.RaceConditionExample2.*;

public class ThreadStopExample {

	public static void main(String[] args) {

		Model model = new Model();

		Modifier task = new Modifier(model);

		Thread thread = new Thread(task);

		thread.start();

		Utils.pause(500);

		model.check();

	}

}