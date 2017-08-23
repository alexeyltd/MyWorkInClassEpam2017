package main.lesson170821.teacherworkinclass;

public class CaptureInLambdas {

	public static class X {

		static int classField = 30;

		int instanceField;

		public void m(int formalParameter) {

			int localVariable = 10;

			Runnable runnable = () -> System.out.println(localVariable + formalParameter + instanceField + classField);
			instanceField = 10;
			classField = 10;
		}
	}

}
