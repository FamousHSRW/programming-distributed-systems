package com.hsrw.programming_distributed_systems;

import java.util.HashMap;
import java.util.Scanner;

public class AnimalApp {
	HashMap<String, Animal> animals = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	

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

	public static void addAnimal() {
		System.out.println("Enter animal type: Mammal | Fish");
		System.out.println("Enter animal name: ");
		System.out.println("Enter animal name: ");
		System.out.println("Enter animal length: ");
		System.out.println("Enter animal number of legs: ");
		System.out.println("Enter animal color: ");
		System.out.println("Enter animal environment: ");
		System.out.println("Enter animal name: ");
		System.out.println("Enter animal name: ");		
	}
	
}
