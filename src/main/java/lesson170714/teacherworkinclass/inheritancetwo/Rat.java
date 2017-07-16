package main.java.lesson170714.teacherworkinclass.inheritancetwo;

public class Rat extends Rodent{

	@Override
	protected void eat() {
		System.out.println("grab");
	}

	@Override
	protected void makesound() {
		teechClac();
		super.makesound();
		teechClac();
	}

	private void teechClac() {
		System.out.println("clac-clac");
	}
}
