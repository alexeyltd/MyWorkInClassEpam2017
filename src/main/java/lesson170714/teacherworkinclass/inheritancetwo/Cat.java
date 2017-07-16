package main.java.lesson170714.teacherworkinclass.inheritancetwo;

public class Cat extends Pet {

	@Override
	protected void eat() {
		System.out.println("eat slowly");
	}

	@Override
	protected void makesound() {
		System.out.println("mu");
	}

}
