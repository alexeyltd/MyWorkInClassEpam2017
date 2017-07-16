package main.lesson170710.teacherworkinclass.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperProblems {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(0);
		list.add(null);

		System.out.println(list);

		Integer x = list.remove(0);
		System.out.println(x);

		System.out.println(list.remove(0));

		Integer y = list.remove(0);

		int c = y.intValue();

	}

}
