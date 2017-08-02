package main.lesson170802.teacherworkinclass.generics;

public class InterfaceAdoptionExample {

	static class D {

	}

	static class E {

	}

	static class Z implements Makeable<D> {

		@Override
		public void doSomethingWith(final D a) {

		}
	}

	static class W implements Makeable {

		@Override
		public void doSomethingWith(final Object a) {

		}
	}

	public static void main(String[] args) {


	}
}
