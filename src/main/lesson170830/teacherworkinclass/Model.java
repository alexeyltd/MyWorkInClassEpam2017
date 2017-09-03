package main.lesson170830.teacherworkinclass;

import main.lesson170828.teacherworkinclass.Utils;

public class Model {

	int x;
	int y;

	public synchronized void change(int z) {
		x += z;
		y -= z;
		Utils.pause(1);
	}

	public void check() {
		if (x + y != 0) {
			throw new IllegalStateException(toString());
		}
	}

	@Override
	public String toString() {
		return x + " , " + y;
	}
}
