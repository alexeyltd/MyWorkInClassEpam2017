package main.lesson170731.teacherworkinclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream("help.txt");

			try {
				int read = fileInputStream.read();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				fileInputStream.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
