package main.lesson170717.myworkinclass.impl;

import main.lesson170717.myworkinclass.abstr.StringInstruments;

public class Violin extends StringInstruments {

	@Override
	protected void makeSound() {
		System.out.println("Vio-Vio");
	}

}
