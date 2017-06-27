package lesson170627.teacherworkinclass.creation;

public class WholePicture {

	static class A {
		int i;
		int y = 10;
		final int z;

		{
			i = y + 30;
		}

		public A() {
			z = 30;
		}
	}

}
