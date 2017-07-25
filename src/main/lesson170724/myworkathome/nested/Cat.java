package main.lesson170724.myworkathome.nested;

public class Cat implements Pet {

	Brain brain = new Fed();

	private class Fed implements Brain {

		@Override
		public void feed() {
			feedYourself();
		}

		@Override
		public void play() {
			plays();
		}

		@Override
		public void clean() {
			cleans();
		}
	}

	private void cleans() {
		System.out.println("cleaning");
	}

	private void plays() {
		System.out.println("playing");
	}

	private void feedYourself() {
		System.out.println("eating");
	}


	@Override
	public void feed() {
		brain.feed();
	}

	@Override
	public void play() {
		brain.play();
	}

	@Override
	public void clean() {
		brain.clean();
	}
}
