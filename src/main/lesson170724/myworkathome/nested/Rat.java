package main.lesson170724.myworkathome.nested;

public class Rat implements Pet {

	Hungry hungry = new Hungry();

	Brain brainOuter = new HungryHelper(hungry);

	@Override
	public void feed() {
		brainOuter.feed();
	}

	@Override
	public void play() {
		brainOuter.play();
	}

	@Override
	public void clean() {
		brainOuter.clean();
	}

}
