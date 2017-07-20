package main.lesson170719.teacherworkinclass.inheritance.Cars;

public class Automobile extends Vehicle {

	@Override
	public void move(final int x, final int y) {
		System.out.println("moves to " + x + ", " + y);
	}

}
