package main.lesson170624.teacherworkinclass.class_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Imports {

	public static void main(String[] args) {

		System.out.println("Hello");

		Random random = new Random();
		List<String> list = new ArrayList<>();

		System.out.println(List.class.getName());
		System.out.println(List.class.getSimpleName());
		System.out.println(List.class.getCanonicalName());
		System.out.println(List.class.getPackage().getName());

	}

}
