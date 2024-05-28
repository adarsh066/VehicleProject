package com.example.vehicles;

public class Truck extends Vehicle {
	private double bedSize;
	private int towingCapacity;

	public Truck(String color, String make, String model, int year, double bedSize, int towingCapacity) {
		super(color, make, model, year);
		this.bedSize = bedSize;
		this.towingCapacity = towingCapacity;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Bed Size: " + bedSize + " cubic feet");
		System.out.println("Towing Capacity: " + towingCapacity + " pounds");
	}
}