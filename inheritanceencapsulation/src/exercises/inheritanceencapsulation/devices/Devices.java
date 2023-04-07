package exercises.inheritanceencapsulation.devices;

public class Devices {

    int year;
    String model;
    double price;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Devices() {}
    public Devices(int year, String model, double price) {
        this.year = year;
        this.model = model;
        this.price = price;
    }


}
