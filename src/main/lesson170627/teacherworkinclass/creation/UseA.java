package main.lesson170627.teacherworkinclass.creation;

public class UseA {

	public static void main(String[] args) {

//		B a = new B();

//		System.out.println(a);

		B b = new B();

		C c = new C();

		c.C();

		Singleton.getInstance().doIt();

		new Z();
		new Z();

		WholePicture.A a = new WholePicture.A();

	}

}
