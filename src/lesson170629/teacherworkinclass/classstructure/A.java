package lesson170629.teacherworkinclass.classstructure;

public class A {

	//class

	static final int MAX = 10;
	static final String SECTER_WORD = "Hello";

	static int instanceCounter = 0;

	static {

	}

	public static int compare(A first, A second) {
		return first.x - second.x;
	}

	// instance

	int x = 0;
	int y = 0;

	{
		instanceCounter++;
	}

	public A() {
		x = 10;
		y = 10;
	}

	public void move(int shiftX, int shiftY) {

		x += shiftX;
		y += shiftY;

	}

	public int compare(A other) {
		return compare(this, other);
	}

}
