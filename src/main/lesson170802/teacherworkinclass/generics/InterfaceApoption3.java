package main.lesson170802.teacherworkinclass.generics;

public class InterfaceApoption3 {

	static class Cleaner<T> implements Cleaning<T> {

		@Override
		public void clean(final T t) {
			System.out.println("cleaning " + t);
		}
	}

	static class StringCleaner implements Cleaning<String> {

		@Override
		public void clean(final String s) {

		}
	}

	public static void main(String[] args) {

		Cleaning<String> cleaner = new Cleaner<>();

		cleaner.clean("one");

		Cleaning cleaner1 = cleaner;
		cleaner1.clean(1);

		cleaner1 = new StringCleaner();

		cleaner1.clean(1);

		Cleaning<Integer> c1 = new Cleaner<>();



	}

}
