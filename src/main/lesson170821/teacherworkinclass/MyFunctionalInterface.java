package main.lesson170821.teacherworkinclass;

public class MyFunctionalInterface {

	public static boolean checkSumIsZero(int x, int y, int z) {
		return x + y + z == 0;
	}

	public static boolean checkProductIsZero(int x, int y, int z) {
		return x * y * z == 0;
	}

	public static void main(String[] args) {

		TriIntToBoolean triIntToBoolean = ((x, y, z) -> checkProductIsZero(x, y, z));

		TriIntToBoolean triIntToBoolean2 = MyFunctionalInterface::checkProductIsZero;

		TriIntToBoolean triIntToBoolean3 = MyFunctionalInterface::checkProductIsZero;


		triIntToBoolean3.test(10, 10, 10);


	}

}
