package main.lesson170719.teacherworkinclass.inheritance.Cars;

public class Car extends Automobile {

	public static final int STANDART_SPEED = 150;
	public static final int STANDART_SEATS_NUMBER = 4;

	Object[] seats;

	public Car() {
		this(STANDART_SEATS_NUMBER);
	}

	protected Car(final int seatsNumber) {
		seats = new Object[seatsNumber];
	}

	public int getSpeed() {

		return STANDART_SPEED;

	}

}
