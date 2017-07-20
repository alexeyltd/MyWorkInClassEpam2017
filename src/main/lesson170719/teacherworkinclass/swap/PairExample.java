package main.lesson170719.teacherworkinclass.swap;




public class PairExample {

	public static void main(String[] args) {

		Pair<String> pair = new Pair<>("one", "Two");
		swap(pair);

		System.out.println(pair.first + " " + pair.second);

	}

	private static<E> void swap(final Pair<E> pair) {
		E tmp = pair.first;
		pair.first = pair.second;
		pair.second = tmp;
	}

}

class Pair<E> {
	E first;
	E second;

	public Pair(final E one, final E two) {
		first = one;
		second = two;
	}
}


