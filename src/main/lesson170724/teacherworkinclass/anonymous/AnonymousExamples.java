package main.lesson170724.teacherworkinclass.anonymous;

public class AnonymousExamples {

	@FunctionalInterface
	interface Operation {

		int apply(int a, int b);

	}

	static class Addition implements Operation {

		@Override
		public int apply(final int a, final int b) {
			return a + b;
		}
	}

	static class Multiplication implements Operation {

		@Override
		public int apply(final int a, final int b) {
			return a * b;
		}
	}

	public static void main(String[] args) {

		int result = process(new Addition() , 10, 20);

		System.out.println(result);

		result = process(new Addition() , 10, 20);

		System.out.println(result);

		result = process((a, b) -> a / b, 40, 10);

		System.out.println(result);

		result = process(new Operation() {
			@Override
			public int apply(final int a, final int b) {
				return a % b;
			}
		}, 40, 10);

		System.out.println(result);

		class Subtract implements Operation {

			@Override
			public int apply(final int a, final int b) {
				return a - b;
			}

		}

		result = process(new Subtract(), 40, 10);

	}

	private static int process(final Operation op, final int i, final int j) {
		return op.apply(i, j);
	}

}
