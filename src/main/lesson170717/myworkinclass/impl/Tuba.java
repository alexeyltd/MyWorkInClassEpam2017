package main.lesson170717.myworkinclass.impl;

import main.lesson170717.myworkinclass.abstr.BrassInstruments;

public class Tuba extends BrassInstruments {

	@Override
	protected void makeSound() {
		System.out.println("Tub-Tub");
	}

}
