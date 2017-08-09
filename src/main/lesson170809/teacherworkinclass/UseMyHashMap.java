package main.lesson170809.teacherworkinclass;

import org.apache.commons.lang.time.StopWatch;

import java.util.Collections;
import java.util.Map;
import java.util.stream.IntStream;

public class UseMyHashMap {

	public static void main(String[] args) {

		StopWatch stopWatchOne = new StopWatch();
		MyHashMap<Integer> myHashMapONe = new MyHashMap<>();
		stopWatchOne.start();
		IntStream.range(0, 1_000).forEach(i -> myHashMapONe.put(i, 0));
		stopWatchOne.stop();
		System.out.println(stopWatchOne.getTime());

		StopWatch stopWatchTwo = new StopWatch();
		MyHashMap<Integer> myHashMapTwo = new MyHashMap<>();
		stopWatchTwo.start();
		IntStream.range(0, 100_000).forEach(i -> myHashMapTwo.put(i, 0));
		stopWatchTwo.stop();
		System.out.println(stopWatchTwo.getTime());

		StopWatch stopWatchThree = new StopWatch();
		MyHashMap<Integer> myHashMapThree = new MyHashMap<>();
		stopWatchThree.start();
		IntStream.range(0, 1_000_000_000).forEach(i -> myHashMapThree.put(i, 0));
		stopWatchThree.stop();
		System.out.println(stopWatchThree.getTime());

	}

}
