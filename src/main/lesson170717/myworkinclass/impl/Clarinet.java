package main.lesson170717.myworkinclass.impl;

import main.lesson170717.myworkinclass.abstr.WindInstruments;

public class Clarinet extends WindInstruments {


	@Override
	protected void makeSound() {
		System.out.println("Fiu-Fiu");
	}

	@Override
	protected void instument() {
		System.out.println("Clarinet");
	}

}
