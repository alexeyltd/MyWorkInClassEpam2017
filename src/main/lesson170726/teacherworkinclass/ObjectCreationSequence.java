package main.lesson170726.teacherworkinclass;

public class ObjectCreationSequence {

	public static void main(String[] args) {
//		new G();
		new B();

	}

}

class G {

	{
		System.out.println("init B");
	}

	G() {
		System.out.println("construct B");
	}

}

class B extends G {

	{
		System.out.println("init B");
	}

	B() {
		super();
		System.out.println("construct B");

	}


}