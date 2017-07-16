package main.lesson170629.teacherworkinclass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Examples {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

		Class c = A.class;


		for (Method m : c.getMethods()) {

			System.out.println(m);

		}

//		A a = new A();

		A a = (A) c.newInstance();

		Constructor<A> constructor = c.getConstructor(null);
		A a2 = constructor.newInstance(null);

		Method m = c.getMethod("m", null);

//		a.m()
		m.invoke(a, null);
	}

}
