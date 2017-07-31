package main.lesson170728.teacherworkinclass;

public class UseStack {

	public static void main(String[] args) {

		MyStack<String> stack = new MyStack<>(2);

		boolean success = false;
		try {
			stack.push("one");
//			stack.push(null);
			stack.push("two");
			success = stack.push("three");
		} catch (Overflow overflow) {
			System.err.println("Stack overflow occured with size " + overflow.getSize());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(success);

	}

}
