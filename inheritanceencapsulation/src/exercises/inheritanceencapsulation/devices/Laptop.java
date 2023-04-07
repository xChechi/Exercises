package exercises.inheritanceencapsulation.devices;

public class Laptop extends Devices {

    String manufacturer;
    String memory;

    public Laptop(int year, String model, double price, String manufacturer, String memory) {
        super(year, model, price);
        this.manufacturer = manufacturer;
        this.memory = memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMemory() {
        return memory;
    }
}
