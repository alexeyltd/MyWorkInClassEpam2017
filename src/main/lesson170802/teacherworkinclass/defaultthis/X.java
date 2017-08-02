package main.lesson170802.teacherworkinclass.defaultthis;

public interface X {

	void a();

	void b();

	default void process() {
		this.a();
		System.out.println(this);
	}

}
