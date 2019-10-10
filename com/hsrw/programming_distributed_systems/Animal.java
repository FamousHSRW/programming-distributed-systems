package com.hsrw.programming_distributed_systems;

import java.lang.reflect.Field;

public class Animal {
	private String name;
	private double length;
	private int legsNumber;
	private String color;
	private String environment;
	private double averageSpeed;
	
	public Animal(String name, double length, int legsNumber, String color, String environment, double averageSpeed) {
		this.name = name;
		this.length = length;
		this.legsNumber = legsNumber;
		this.color = color;
		this.environment = environment;
		this.averageSpeed = averageSpeed;
	}

	public static void main(String[] args) {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getLegsNumber() {
		return legsNumber;
	}
	public void setLegsNumber(int legsNumber) {
		this.legsNumber = legsNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public double getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	public String createDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getName());
		sb.append(": ");
		for (Field f: getClass().getDeclaredFields()) {
			sb.append(f.getName());
			sb.append("=");
			try {
				sb.append(f.get(this));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			sb.append(", ");
		}
		for (Field f: getClass().getSuperclass().getDeclaredFields()) {
			sb.append(f.getName());
			sb.append("=");
		    try {
				sb.append(f.get(this));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			sb.append(", ");
		}
		return sb.toString();
		
	}
	

}
