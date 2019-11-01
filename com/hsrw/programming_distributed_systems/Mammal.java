package com.hsrw.programming_distributed_systems;


public class Mammal extends Animal {
	String food;
	public Mammal(String food, String name, double length, int legsNumber, String color, String environment, double averageSpeed) {
		super(name, length, legsNumber, color, environment, averageSpeed);
		this.food = food;
	}

	public static void main(String[] args) {

	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String create() {
		String desc = super.test();
		return desc + "food="+food;
	}
}
