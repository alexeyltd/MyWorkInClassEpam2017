package lesson170710.myworkathome.linkedlist;

public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList<String> linkedList = new MyLinkedList<>();

		linkedList.add("one");
		linkedList.add("two");

		linkedList.remove(0);

		System.out.println(linkedList);

	}

}
