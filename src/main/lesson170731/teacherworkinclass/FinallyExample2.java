package main.lesson170731.teacherworkinclass;

public class FinallyExample2 {

	public static void main(String[] args) {

		int r = get();

		System.out.println(r);

	}

	private static int get() {

		try	{
			return 0;
		} catch (Exception e) {
			return calculateResult();
		} finally {
			return 20;
		}

	}

	private static int calculateResult() {
		return 10;
	}

}
