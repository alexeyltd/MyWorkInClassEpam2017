package main.lesson170717.myworkinclass;

import main.lesson170717.myworkinclass.impl.*;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<MusicInstruments> musicInstrumentsList = Arrays.asList(new Clarinet(), new Cymbals(), new Piano(), new Tuba(), new Violin());

		for (MusicInstruments instruments : musicInstrumentsList) {
			instruments.sound();
		}

	}

}
