package main.lesson170706.teacherworkinclass;

public class StringExamples {

	public static void main(String[] args) {

		String s = "hey";

		String concat = s.concat(" hey");

		String ne = s + "hey";

		System.out.println(ne);


		String s0 = "hello";

		String s1 = new String("hello");

		String s2 = new String(s0);

		String s3 = new String(s1);

		System.out.println(System.identityHashCode(s0));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

		System.out.println(s0.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s3));
		System.out.println(s3.equals(s1));

		String s5 = "hello";

		System.out.println(s5 == s0);


	}

}
