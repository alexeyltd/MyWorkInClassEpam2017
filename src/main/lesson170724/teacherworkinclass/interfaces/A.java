package main.lesson170724.teacherworkinclass.interfaces;

import java.io.Serializable;

class A implements Serializable {

	int x;

	String s;

	@Override
	public String toString() {
		return "B{" +
				"x=" + x +
				", s='" + s + '\'' +
				'}';
	}
}
