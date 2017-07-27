package main.lesson170726.teacherworkinclass.outer;

import main.lesson170726.teacherworkinclass.Special;

public class UseSpecial {

	public static void main(String[] args) {

		Special special = Special.createDefaultImlp();

		special.doSomethingExceprional();

		Special special2 = Special.createDefaultImlp();

		special2.doSomethingExceprional();

		System.out.println(special);
		System.out.println(special2);

		Special.A a = new Special.A();

//		Special.special = null;

	}

}
