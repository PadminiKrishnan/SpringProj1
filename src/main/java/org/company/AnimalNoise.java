package org.company;

public class AnimalNoise {

	public AnimalNoise() {
	}
	
	private Animal animal;

	public AnimalNoise(Animal animal) {
		this.animal = animal;
	}

	public void shout() {
		animal.makeNoise();
	}
}
