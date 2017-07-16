package main.java.lesson170712.myworkathome.stack;

public class MyStackTest {

	public static void main(String[] args) {

		MyStack<String> myStack = new MyStack<>();

		myStack.push("hey");
		myStack.push("wow!");

		myStack.pop();

		System.out.println(myStack.tos());
		System.out.println(myStack);

		System.out.println(MyStackUnit.assertEquals(myStack.tos(), "wow!"));
		System.out.println(MyStackUnit.assertNotEquals(myStack.pop(), "hey"));

	}

}
