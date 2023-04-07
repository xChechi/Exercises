package exercises.inheritanceencapsulation.devices;

public class Smartphone extends Devices{

    int simCards;

    public Smartphone(int year, String model, double price, int simCards) {
        super(year, model, price);
        this.simCards = simCards;
    }

    public int getSimCards() {
        return simCards;
    }
}
