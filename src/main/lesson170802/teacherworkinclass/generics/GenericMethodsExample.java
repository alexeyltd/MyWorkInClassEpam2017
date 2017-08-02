package main.lesson170802.teacherworkinclass.generics;

public class GenericMethodsExample {

	static class X<T> {

		public static <M> M modify(M t) {
			return t;
		}

		public <M> void m(M t) {

		}

	}

	static class Example<T> {

		public static <M> void staticMethod(M m) {
			System.out.println(m.getClass().getTypeName());
		}

		public <M> void instanceMethod(M m) {
			System.out.println(m);
		}

	}

	public static void main(String[] args) {

		String mod = X.modify("one");


		Example<String> example = new Example<>();
		Example<Integer> integerExample = new Example<>();

		example.instanceMethod("one");
		example.instanceMethod(1);
		example.instanceMethod(GenericMethodsExample.class);

		Example.staticMethod(example);
		Example.staticMethod(integerExample);

	}

}
