package main.java.lesson170627.teacherworkinclass.creation;

public class Singleton {

	static private Singleton instance = new Singleton();

	private Singleton() {

	}

	static public Singleton getInstance() {
		return instance;
	}

	public void doIt() {
		System.out.println("did it");
	}

}
