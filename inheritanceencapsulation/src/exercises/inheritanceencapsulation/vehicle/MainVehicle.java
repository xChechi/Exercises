package exercises.inheritanceencapsulation.vehicle;

public class MainVehicle {

    public static void main(String[] args) {

            Vehicle vehicle1 = new Vehicle(1981, "Mondeo", "diesel");
            Vehicle vehicle2 = new Vehicle(1977, "Icarus", "diesel", 8, 6);
            Vehicle vehicle3 = new Vehicle(1968, "Kamaz", "unleashed", 6400);

            Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};

            for (Vehicle v : vehicles) {
                if (v.seats > 0) {
                    System.out.println("This vehicle is a bus, model " + v.model + " from " + v.year);
                }else if (v.weight > 0) {
                    System.out.println("This vehicle is a truck, model " + v.model + " from " + v.year);
                } else System.out.println("This vehicle is a car, model " + v.model + " from " + v.year);

            }

    }
}
