package main.lesson170726.teacherworkinclass;

abstract public class Furniture implements Cleanable {

	@Override
	public void combine() {

	}

	@Override
	public void takeApart() {

	}

}

interface Cleanable {

	default void clean() {

		takeApart();
		System.out.println("cleaning parts");
		combine();

	}

	void combine();

	void takeApart();

}


class Table extends Furniture {



}

class Chair extends Furniture {



}
