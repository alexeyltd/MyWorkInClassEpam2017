package main.lesson170728.teacherworkinclass;

public class NPEExample {

	public static void main(String[] args) {

		try {
			printObjectInfo(null);
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

	}

	private static void printObjectInfo(final Object o) {

		if (o == null) {
			return;
		}

		System.out.println("class name " + o.getClass().getCanonicalName());
		System.out.println("class name " + o.hashCode());
		System.out.println("class name " + o.toString());

	}

}
