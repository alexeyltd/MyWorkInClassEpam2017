package main.lesson170717.myworkinclass;

public abstract class MusicInstruments {

	void sound() {

		instument();
		makeSound();

	}

	protected abstract void makeSound();

	protected abstract void instument();


}
