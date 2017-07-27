package main.lesson170726.teacherworkinclass;

public interface Special {

	class A {

	}

	Special special = () -> System.out.println("I an exceptional!");

	//	factory method
	static Special createDefaultImlp() {

		return special;
	}

	void doSomethingExceprional();

}
