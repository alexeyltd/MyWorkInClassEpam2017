package main.lesson170717.myworkinclass.impl;

import main.lesson170717.myworkinclass.abstr.PercussionInstruments;

public class Cymbals extends PercussionInstruments {

	@Override
	protected void makeSound() {
		System.out.println("Cymb-Cymb");
	}

}
