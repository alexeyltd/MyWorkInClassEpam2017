package main.lesson170821.teacherworkinclass;

import java.util.*;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<LocalDate> dateSupplier3 = new Supplier<LocalDate>() {
			@Override
			public LocalDate get() {
				return LocalDate.now();
			}
		};

		Supplier<LocalDate> dateSupplier2 = () -> LocalDate.now();

		Supplier<LocalDate> dateSupplier = LocalDate::now;


		System.out.println(dateSupplier.get());


		Supplier<List<String>>  listSupplier = new Supplier<List<String>>() {
			@Override
			public List<String> get() {
				return new ArrayList<>();
			}
		};

		Supplier<List<String>>  listSupplier2 = () -> new ArrayList<>();

		Supplier<List<String>>  listSupplier3 = ArrayList::new;

	}

}
