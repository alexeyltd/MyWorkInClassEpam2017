package main.lesson170731.teacherworkinclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchModifiedExample {

	public static void main(String[] args) {

		try {

			try (FileInputStream fileInputStream = new FileInputStream("help.txt")) {
				int read = fileInputStream.read();
			}

		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
