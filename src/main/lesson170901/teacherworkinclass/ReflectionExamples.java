package main.lesson170901.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples {

	static {
		System.out.println("static init");
	}

	public static void main(String[] args) {

		System.out.println("start");

		Utils.pause(3000);

		System.out.println(Sample.MAX);

		new Sample();

		System.out.println("reflection");

		Class<Sample> clazz = Sample.class;

		Constructor<?>[] constructors = clazz.getDeclaredConstructors();

		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}

		for (Method method: clazz.getMethods()) {
			System.out.println(method);
		}

		System.out.println("-------");

		for (Method method: clazz.getDeclaredMethods()) {
			System.out.println(method);
		}

		try {
			Sample sample = clazz.newInstance();
			Method bigChange = clazz.getMethod("bigChange", null);
			bigChange.invoke(sample, null);
		} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}


	}

}

class Sample {
	public static int MAX = 10;
	static {
		System.out.println("static sample init");
	}

	void change() {}

	public void bigChange() {
		System.out.println("very big change");
	}


}
