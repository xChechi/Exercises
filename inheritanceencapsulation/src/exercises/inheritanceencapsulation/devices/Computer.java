package exercises.inheritanceencapsulation.devices;

public class Computer extends Devices {

    String opSystem;

    @Override
    public String toString() {
        return "exercises.inheritanceencapsulation.devices.Computer{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Computer(int year, String model, double price, String opSystem) {
        super(year, model, price);
        this.opSystem = opSystem;
    }

    public String getOpSystem() {
        return opSystem;
    }
}
