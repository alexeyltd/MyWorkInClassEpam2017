package main.lesson170724.myworkathome.nested;

public class Hungry implements Brain {

	Rat rat = new Rat();

	@Override
	public void feed() {
		rat.bark();
	}

	@Override
	public void play() {
		rat.playWithToy();
	}

	@Override
	public void clean() {
		rat.cleans();
	}



}
