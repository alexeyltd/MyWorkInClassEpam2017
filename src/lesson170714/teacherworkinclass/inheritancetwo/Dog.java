package lesson170714.teacherworkinclass.inheritancetwo;

public class Dog extends Pet {

	@Override
	protected void eat() {
		System.out.println("eat fast and eager");
	}

	@Override
	protected void makesound() {
		System.out.println("bark");
	}

}
