package main.lesson170706.teacherworkinclass;

public class EvilString {

	public static final int CHAR_SIZE = 1_000_000;
	private final char[] value;
	private int offset;
	private int length;

	public EvilString(String value) {
		this.value = value.toCharArray();
		length = value.length();
	}

	private EvilString(char[] value, int offset, int length) {
		this.value = value;
		this.offset = offset;
		this.length = length;
	}

	public EvilString subString(int begin, int end) {

		return new EvilString(value, begin, end - begin);
	}

	@Override
	public String toString() {
		return new String(value);
	}


	public static void main(String[] args) {

		String s = new String(new char[CHAR_SIZE]);

		EvilString evilString = new EvilString(s);

		EvilString word = evilString.subString(0, 10);

	}
}
