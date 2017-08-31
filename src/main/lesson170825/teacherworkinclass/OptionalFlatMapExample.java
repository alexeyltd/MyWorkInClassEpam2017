package main.lesson170825.teacherworkinclass;

import java.util.Optional;

public class OptionalFlatMapExample {

	public static void main(String[] args) {

		Person p = new Person();
		Car car = new Car();
		Insurance insurance = new Insurance("Renessance");

		car.insurance = Optional.of(insurance);
		p.car = Optional.of(car);

		System.out.println(getCarInsuranceName(null));
		System.out.println(getCarInsuranceName(new Person()));
		System.out.println(getCarInsuranceName(p));


	}

	public static String getCarInsuranceName(Person person) {
		return Optional.ofNullable(person).flatMap(Person::getCar).flatMap(Car::getInsurance)
				.map(Insurance::getName).orElse("Unknown");
	}

}

class Person {
	Optional<Car> car = Optional.empty();

	public Optional<Car> getCar() {
		return car;
	}
}

class Car {
	Optional<Insurance> insurance = Optional.empty();

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
}

class Insurance {
	String name;

	public Insurance(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
