package com.hsrw.programming_distributed_systems;


public class Fish extends Animal {
	String characteristic;

	public Fish(String characteristic, String name, double length, int legsNumber, String color, String environment, double averageSpeed) {
		super(name, length, legsNumber, color, environment, averageSpeed);
		this.characteristic = characteristic;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public String getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

}
