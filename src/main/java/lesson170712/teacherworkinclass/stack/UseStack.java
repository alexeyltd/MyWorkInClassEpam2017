package main.java.lesson170712.teacherworkinclass.stack;

public class UseStack {

	public static void main(String[] args) {

		MyStack<String> stack = new MyStack<>();

		stack.push("one");
		stack.push("two");
		stack.push("three");


		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.tos());


		System.out.println(stack);


	}

}