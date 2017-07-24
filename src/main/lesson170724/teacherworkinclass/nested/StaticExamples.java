package main.lesson170724.teacherworkinclass.nested;

public class StaticExamples {

	static class A extends StaticExamples {

		static class B extends A {

		}

	}

	static class X {

		static int Z = 0;

		int state;

		public void change() {
			state++;
		}

		public void evaluate() {
			state = 30;
			change();
			change();
		}

		static class Y{
			public void process() {
				StaticExamples.X.Z = 50;
//				state = 20;
//				change();
//				change();
			}
		}

	}

}
