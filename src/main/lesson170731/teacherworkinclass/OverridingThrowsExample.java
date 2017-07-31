package main.lesson170731.teacherworkinclass;

public class OverridingThrowsExample {

	static class MyException extends Exception {



	}

	static class A {

		public void m() throws MyException {

		}

	}

	static class B extends A {

		@Override
		public void m() {
		}
	}

	static class C extends A {

		@Override
		public void m() throws MyException {
		}
	}

	public static void main(String[] args) {

		A a = new C();

		try {
			a.m();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
