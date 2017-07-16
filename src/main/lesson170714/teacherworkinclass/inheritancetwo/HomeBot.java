package main.lesson170714.teacherworkinclass.inheritancetwo;

import java.util.Arrays;
import java.util.List;

public class HomeBot {

	public static void main(String[] args) {

		List<Pet> pets = Arrays.asList(new Dog(), new Cat());

		for (Pet pet : pets) {
			pet.feed();
		}

//		Pet pet = new Pet();

		Rat rat = new Rat();
		rat.feed();
	}

}
