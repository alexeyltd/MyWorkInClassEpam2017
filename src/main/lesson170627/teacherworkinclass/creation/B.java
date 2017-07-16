package main.lesson170627.teacherworkinclass.creation;


public class B extends A {

	{
		System.out.println("init B");
	}

	B() {
		super();
		System.out.println("constructor B");
	}

}
