package main.lesson170724.teacherworkinclass.nested;

public class TakeCare {

	public static void main(String[] args) {

		Pet pet = new Dog();

		pet.play();
		System.out.println("---");
		pet.feed();
		System.out.println("---");
		pet.feed();
		pet.play();
		pet.play();

	}

}
