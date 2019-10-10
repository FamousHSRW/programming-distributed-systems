package com.hsrw.programming_distributed_systems;

public class AnimalApp {

	public AnimalApp() {
	}

	public static void main(String[] args) {
		Mammal camel = new Mammal("Grass", "Camel", 150, 4, "Yellow", "Terrestrial", 40.0);
		Fish shark = new Fish("Have fins", "Shark", 300, 0, "Gray", "Aquatic", 32.1);
		Animal animal = new Animal("Shark", 300, 0, "Gray", "Aquatic", 32.1);
		System.out.println(camel.createDescription());
		System.out.println(shark.createDescription());
		System.out.println(animal.createDescription());
	}
}
