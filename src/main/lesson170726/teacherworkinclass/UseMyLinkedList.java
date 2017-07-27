package main.lesson170726.teacherworkinclass;

import java.util.Iterator;

public class UseMyLinkedList {

	public static void main(String[] args) {

		MyLinkedList<String> list = new MyLinkedList<>();

		list.add("one");
		list.add("two");
		list.add("three");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (String str: list) {
			System.out.println(str);
		}

	}

}
