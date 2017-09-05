package main.lesson170901.teacherworkinclass;

public class Animal {

	private final int id;
	private final String name;
	private final int age;

	public Animal(final int id, final String name, final int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(final Object obj) {
		if (!(obj instanceof Animal)) {
			return false;
		}
		Animal other = (Animal) obj;
		if (this.id != other.id) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		return this.name.equals(other.name);
	}

	@Override
	public int hashCode() {
		int hashcode = 7;
		hashcode = hashcode + 31 * this.name.hashCode();
		hashcode = hashcode + 31 * this.id;
		hashcode = hashcode + 31 * this.age;
		return hashcode;
	}
}
