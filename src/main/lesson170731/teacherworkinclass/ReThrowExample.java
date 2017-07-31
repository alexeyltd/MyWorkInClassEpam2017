package main.lesson170731.teacherworkinclass;

public class ReThrowExample {

	public static void main(String[] args) {
		try {
			buildHouse();
		} catch (Exception e) {

			Exception exception = e;

			while (exception != null) {
				exception.printStackTrace();
				exception.getCause();
			}
		}

	}

	private static void buildHouse() {
		try {
			buildBasement();
		} catch (Exception e)  {
			throw new ProblemWithTechnical(e);
		}

	}

	private static void buildBasement() {

		try	{
			digPit();
		} catch (Exception e) {
			throw new NoneInstrument(e);
//			do something
//			throw e;
		}

	}

	private static void digPit() {
		throw new NoneGraft();
	}

}
