package main.lesson170724.myworkathome.nested;

public class HungryHelper implements Brain {

	private final Hungry hungry;

	HungryHelper(final Hungry hungry) {
		this.hungry = hungry;
	}

	@Override
	public void feed() {
		hungry.bark();
	}

	@Override
	public void play() {
		hungry.playWithToy();
	}

	@Override
	public void clean() {
		hungry.clean();
	}
}
