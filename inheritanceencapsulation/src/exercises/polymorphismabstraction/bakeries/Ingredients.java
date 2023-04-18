package exercises.polymorphismabstraction.bakeries;

public class Ingredients {

    private int flour;
    private int salt;
    private int water;

    public Ingredients(int flour, int salt, int water) {
        this.flour = flour;
        this.salt = salt;
        this.water = water;
    }

    public int getFlour() {
        return flour;
    }

    public int getSalt() {
        return salt;
    }

    public int getWater() {
        return water;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "flour=" + flour +
                ", salt=" + salt +
                ", water=" + water +
                '}';
    }
}
