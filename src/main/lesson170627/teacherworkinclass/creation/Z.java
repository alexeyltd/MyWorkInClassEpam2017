package main.lesson170627.teacherworkinclass.creation;

public class Z {

	static int s = 9;

	static {
		System.out.println("static init");
	}

	long timestamp = System.currentTimeMillis();

	{
		System.out.println("init");
	}

	Z() {

	}
}
