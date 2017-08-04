package main.lesson170804.teacherworkinclass.bounds;

public class MultipleBounds {

	public static void main(String[] args) {

		A a = new A();

		B b = new B();

		process(a);
		process(b);

	}

	private static <T extends X & Y>  void process(final T thing) {
		thing.x();
		thing.y();
	}

	interface X {
		void x();
	}

	interface Y {
		void y();
	}

}

class A implements MultipleBounds.X, MultipleBounds.Y {
	@Override
	public void x() {

	}

	@Override
	public void y() {

	}
}

class B implements MultipleBounds.X, MultipleBounds.Y {
	@Override
	public void x() {

	}

	@Override
	public void y() {

	}
}
