package lesson170714.teacherworkinclass.inheritancetwo;

public abstract class Pet extends Mammal {

	public void feed() {
		makesound();
		eat();
		makesound();
	}

	abstract protected void eat();

	abstract protected void makesound();

}
