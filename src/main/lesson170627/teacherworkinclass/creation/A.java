package main.lesson170627.teacherworkinclass.creation;

public class A {

	int i;
	long timestamp;

	//	initialization class A for instance
	{
		System.out.println("init A");
	}

	public A() {
		super();
		System.out.println("const A");
		i = 10;
		timestamp = System.currentTimeMillis();
	}

	{
		System.out.println("init2 A");
	}

}
