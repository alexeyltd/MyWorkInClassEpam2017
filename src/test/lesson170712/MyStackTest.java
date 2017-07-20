package lesson170712;

import main.lesson170712.myworkathome.stack.MyStack;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

	@Test
	public void testMyStack() {

		MyStack<String> myStack = new MyStack<>();

		myStack.push("hey");
		myStack.push("wow!");

		myStack.pop();

		System.out.println(myStack.tos());
		System.out.println(myStack);

		assertEquals("wow!", myStack.tos());
		assertNotEquals("hey", myStack.pop());
	}

}
