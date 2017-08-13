package main.lesson170811.teacherworkinclass;
import java.util.*;

public class ComparatorsExample {

	public static class Person {
		String name;
		String country;

		public Person(final String name, final String country) {
			this.name = name;
			this.country = country;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", country='" + country + '\'' +
					'}';
		}
	}

	public static class CompareByName implements Comparator<Person> {
		@Override
		public int compare(final Person o1, final Person o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	public static class CompareByCountry implements Comparator<Person> {
		@Override
		public int compare(final Person o1, final Person o2) {
			return o1.country.compareTo(o2.country);
		}
	}

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("Pete", "USA"));
		list.add(new Person("Jere", "USA"));
		list.add(new Person("Ker", "USA"));
		list.add(new Person("Nona", "USA"));
		list.add(new Person("Care", "USA"));

		list.sort(new CompareByName());
		list.sort(new CompareByCountry());

		System.out.println(list);

	}

}
