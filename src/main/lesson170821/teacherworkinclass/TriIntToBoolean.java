package main.lesson170821.teacherworkinclass;

@FunctionalInterface
public interface TriIntToBoolean {
	boolean test(int x, int y, int z);
	default void x() {}
}
