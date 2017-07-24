package main.lesson170724.teacherworkinclass.interfaces;

public class TaggedInterfaceDemo implements Tag {

	static class X implements Tag {



	}

	static class Y {



	}

	public static void main(String[] args) {

		X x = new X();

		Y y = new Y();

		process(x);

		process(y);

	}

	private static void process(final Object object) {

		if (object instanceof Tag) {



		}

	}

}


