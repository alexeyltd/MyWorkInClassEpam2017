package main.java.lesson170629.teacherworkinclass.classstructure;

public class SyncExample {

	static void classMethod() {
		synchronized (SyncExample.class) {

		}
	}

	void instanceMethod() {
		synchronized (this) {

		}
	}

}
