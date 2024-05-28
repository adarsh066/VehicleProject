package com.example.vehicles;

public class ElectricCar extends Car implements Chargeable {
	private int batteryCapacity;
	private int range;

	public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType,
			int batteryCapacity, int range) {
		super(color, make, model, year, numDoors, transmissionType);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
		System.out.println("Range: " + range + " miles");
	}

	@Override
	public void charge() {
		System.out.println("Charging the electric car...");
	}
}