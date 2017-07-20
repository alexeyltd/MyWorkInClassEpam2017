package main.lesson170719.teacherworkinclass.interfaces.hierarchy;

public class Chair extends Furniture {

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName());
	}
}
