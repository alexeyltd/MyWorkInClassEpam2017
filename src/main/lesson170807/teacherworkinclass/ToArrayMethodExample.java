package main.lesson170807.teacherworkinclass;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ToArrayMethodExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("two");
		list.add("three");

		String[] strings = list.toArray(new String[list.size()]);


		Set<String> anotherList = new HashSet<>();

		anotherList.addAll(list);

		System.out.println(anotherList);

	}

}
