package main.lesson170724.myworkathome.nested;

public class Rat implements Pet {

	Brain brainOuter = new Hungry();

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

	void bark() {
		System.out.println("bark");
	}

	void playWithToy() {
		System.out.println("playing with toy");
	}

	void cleans() {
		System.out.println("cleaning myself");
	}

}
