package main.lesson170728.teacherworkinclass;

public class UseStack {

	public static void main(String[] args) {

		MyStack<String> stack = new MyStack<>(2);

		boolean success = false;
		try {
			stack.push("one");
			stack.push("two");
			success = stack.push("three");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(success);

	}

}
