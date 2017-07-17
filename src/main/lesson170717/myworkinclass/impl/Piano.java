package main.lesson170717.myworkinclass.impl;

import main.lesson170717.myworkinclass.abstr.ElectronicInstruments;

public class Piano extends ElectronicInstruments {

	@Override
	protected void makeSound() {
		System.out.println("Piu-Piu");
	}

}
