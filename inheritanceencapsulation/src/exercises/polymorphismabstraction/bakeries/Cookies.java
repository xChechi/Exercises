package exercises.polymorphismabstraction.bakeries;

public class Cookies extends Ingredients implements IBaking {

    private int sugar;

    public Cookies(int flour, int salt, int water, int sugar) {
        super(flour, salt, water);
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public void baking() {
        System.out.printf("Cookies contains: flour: %d, salt: %d, water: %d, sugar: %d%n"
                , getFlour(), getSalt(), getWater(), getSugar());
    }

    @Override
    public void garlicBaking() {
        System.out.printf("Garlic cookies contains: flour: %d, salt: %d, water: %d, sugar: %d and a little garlic%n"
                , getFlour()+100, getSalt()+1, getWater()-200, getSugar()+30);
    }
}
