package com.example.vehicles;

public class GasolineCar extends Car implements Refuelable {
	private int fuelCapacity;
	private double mpg;

	public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			int fuelCapacity, double mpg) {
		super(color, make, model, year, numDoors, transmissionType);
		this.fuelCapacity = fuelCapacity;
		this.mpg = mpg;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
		System.out.println("Miles per Gallon: " + mpg);
	}

	@Override
	public void refuel() {
		System.out.println("Refueling the gasoline car...");
	}
}