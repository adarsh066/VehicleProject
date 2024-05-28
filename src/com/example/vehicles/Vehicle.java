package com.example.vehicles;

public class Vehicle {
	private String color;
	private String make;
	private String model;
	private int year;

	public Vehicle(String color, String make, String model, int year) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayDetails() {
		System.out.println("Color: " + color);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}