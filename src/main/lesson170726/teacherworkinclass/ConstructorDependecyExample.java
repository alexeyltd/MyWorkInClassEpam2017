package main.lesson170726.teacherworkinclass;

public class ConstructorDependecyExample {

	static Worker create() {
		class BigTroll implements Worker {

			@Override
			public void doIt() {
				System.out.println("don't want to");
			}

		}

		return new BigTroll();
	}

	static class B implements Worker {
		public void doIt() {
			System.out.println("did it");
		}
	}

	static class A {

		private Worker b;

		public A(B b) {
			this.b = b;
		}

		void change() {
			b.doIt();
		}

		public void setWorker(final Worker worker) {
			this.b = worker;
		}

	}

	public static void main(String[] args) {

		A a = new A(new B());

		a = new A(new B() {
			@Override
			public void doIt() {
				System.out.println("aga");
			}
		});

		a.change();

		class C extends B {
			@Override
			public void doIt() {
				System.out.println("c-style");
			}
		}

		a.setWorker(new C());

		a.setWorker(() -> System.out.println("done!"));

		a.setWorker(create());

	}

}
