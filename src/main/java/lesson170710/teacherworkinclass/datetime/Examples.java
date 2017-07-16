package main.java.lesson170710.teacherworkinclass.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Examples {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date);

		System.out.println(Calendar.getInstance().getTime());

		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());




	}

}
