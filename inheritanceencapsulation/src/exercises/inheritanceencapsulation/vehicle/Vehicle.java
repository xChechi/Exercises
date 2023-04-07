package exercises.inheritanceencapsulation.vehicle;

public class Vehicle {

    int year;
    String model;
    String fuel;
    int seats;
    int doors;
    int weight;

    public Vehicle(int year, String model, String fuel) {
        this.year = year;
        this.model = model;
        this.fuel = fuel;
    }

    public Vehicle(int year, String model, String fuel, int seats, int doors) {
        this.year = year;
        this.model = model;
        this.fuel = fuel;
        this.seats = seats;
        this.doors = doors;
    }

    public Vehicle(int year, String model, String fuel, int weight) {
        this.year = year;
        this.model = model;
        this.fuel = fuel;
        this.weight = weight;
    }
}
