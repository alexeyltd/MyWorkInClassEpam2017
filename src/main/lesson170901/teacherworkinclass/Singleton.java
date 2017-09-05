package main.lesson170901.teacherworkinclass;

public enum Singleton {

	INSTANCE;

	private int state;

	Singleton() {}

	public void change() {
		state++;
	}

	public int getState() {
		return state;
	}

}
