package main.lesson170719.teacherworkinclass.inheritance.Cars;

public class Mercedes extends Car {

	public Mercedes() {
		super();
	}

	public Mercedes(final int seats) {
		super(seats);
	}

	@Override
	public int getSpeed() {
		return super.getSpeed() + 50;
	}

}
