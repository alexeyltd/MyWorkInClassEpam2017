package main.lesson170901.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class EnumExamples {

	public static void main(String[] args) {

		System.out.println("start");

		Seasons s;

		Utils.pause(5000);

		Seasons[] values = Seasons.values();

		for (Seasons season : Seasons.values()) {
			System.out.println(season + " " + season.ordinal());
		}

		Seasons currentSeason = Seasons.WINTER;

		switch (currentSeason) {
			case WINTER:
				break;
			case SPRING:
				break;
			case SUMMER:
				break;
			case AUTUMN:
				System.out.println("hey");
				break;
			default:
				break;
		}

		int state = Singleton.INSTANCE.getState();

	}

}
