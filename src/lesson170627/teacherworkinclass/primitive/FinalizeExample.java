package lesson170627.teacherworkinclass.primitive;

import java.util.LinkedList;
import java.util.List;

public class FinalizeExample {

	static List<A> storage = new LinkedList<>();

	static class A {

		@Override
		protected void finalize() throws Throwable {
			System.out.println("I'm dying ...");
		}

	}

	public static void main(String[] args) {

		while (true) {
			storage.add(new A());
		}

	}

}
