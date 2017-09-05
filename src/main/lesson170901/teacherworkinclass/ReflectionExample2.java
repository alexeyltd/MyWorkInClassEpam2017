package main.lesson170901.teacherworkinclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

public class ReflectionExample2 {

	public static void main(String[] args) {

		Object o = new Object() {
			public void one() {
				System.out.println("one");
			}
		};

//		process(null);
		process(o);

	}

	private static void process(Object object) {
		Class<? extends Object> clazz = object.getClass();

		Method method = null;
		try {
			method = clazz.getMethod("one", null);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		Optional.ofNullable(method).ifPresent(m -> {
			try {
				m.invoke(object, null);
			} catch (IllegalAccessException | InvocationTargetException e) {
				System.out.println("no one method !");
				e.printStackTrace();
			}
		});

	}

}
