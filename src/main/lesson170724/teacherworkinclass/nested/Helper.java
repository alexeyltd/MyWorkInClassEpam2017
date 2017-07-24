package main.lesson170724.teacherworkinclass.nested;

public class Helper {

	private final Outer outer;

	public Helper(Outer outer) {
		this.outer = outer;
	}

	void process() {

		outer.state = 20;
		outer.change();
		outer.change();

	}
}
