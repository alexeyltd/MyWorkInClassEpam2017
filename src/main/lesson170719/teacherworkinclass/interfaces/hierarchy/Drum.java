package main.lesson170719.teacherworkinclass.interfaces.hierarchy;

public class Drum extends Instrument {

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName());
	}
}
