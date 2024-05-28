package com.example.vehicles;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle1 = new ElectricCar("Red", "Tesla", "Model S", 2022, 4, "Automatic", 100, 370);
		Vehicle vehicle2 = new GasolineCar("Blue", "Toyota", "Camry", 2021, 4, "Automatic", 16, 28);
		Vehicle vehicle3 = new Truck("Black", "Ford", "F-150", 2020, 6.5, 13000);

		System.out.println("Electric Car Details:");
		vehicle1.displayDetails();
		if (vehicle1 instanceof Chargeable) {
			((Chargeable) vehicle1).charge();
		}
		System.out.println();

		System.out.println("Gasoline Car Details:");
		vehicle2.displayDetails();
		if (vehicle2 instanceof Refuelable) {
			((Refuelable) vehicle2).refuel();
		}
		System.out.println();

		System.out.println("Truck Details:");
		vehicle3.displayDetails();
	}
}