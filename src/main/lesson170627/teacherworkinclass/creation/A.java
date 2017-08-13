package main.lesson170627.teacherworkinclass.creation;

public class A {

	int i;
	long timestamp;

	//	initialization class B for instance
	{
		System.out.println("init B");
	}

	public A() {
		super();
		System.out.println("const B");
		i = 10;
		timestamp = System.currentTimeMillis();
	}

	{
		System.out.println("init2 B");
	}

}
