package exercises.polymorphismabstraction.bakeries;

public class Banitza extends Ingredients implements IBaking{

    private int eggs;
    private int cheese;

    public Banitza(int flour, int salt, int water, int eggs, int cheese) {
        super(flour, salt, water);
        this.eggs = eggs;
        this.cheese = cheese;
    }

    public int getEggs() {
        return eggs;
    }

    public int getCheese() {
        return cheese;
    }

    @Override
    public void baking() {
        System.out.printf("Banitza contains: flour: %d, salt: %d, water: %d, eggs: %d, cheese: %d%n"
                , getFlour(), getSalt(), getWater(), getEggs(), getCheese());
    }

    @Override
    public void garlicBaking() {
        System.out.printf("Garlic banitza contains: flour: %d, salt: %d, water: %d, eggs: %d, cheese: %d and a little garlic%n"
                , getFlour()+100, getSalt()+1, getWater()-200, getEggs()+1, getCheese()+150);
    }
}
