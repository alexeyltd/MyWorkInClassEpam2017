package lesson170710.teacherworkinclass.wrapperclasses;

import java.util.HashMap;
import java.util.Map;

public class WrapperClasses {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "123");
		map.put(2, "1234");
		map.put(3, "1235");

		System.out.println(map);

		new Integer(1);

	}

}
