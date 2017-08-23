package main.lesson170821.teacherworkinclass;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consumer = s -> System.out.println(s);

		Consumer<String> consumer2 = System.out::println;

		consumer2.accept("hello, world");

		Map<String, Integer> map = new HashMap<>();

		BiConsumer<String, Integer> biConsumer = (key, value) -> map.put(key, value);

		BiConsumer<String, Integer> biConsumer2 = map::put;

	}

}
