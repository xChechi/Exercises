package exercises.polymorphismabstraction.bakeries;

public class Bread extends Ingredients implements IBaking {

    private int sunflowerOil;
    private int gluten;

    public Bread(int flour, int salt, int water, int sunflowerOil, int gluten) {
        super(flour, salt, water);
        this.sunflowerOil = sunflowerOil;
        this.gluten = gluten;
    }

    public int getSunflowerOil() {
        return sunflowerOil;
    }

    public int getGluten() {
        return gluten;
    }

    @Override
    public void baking() {
        System.out.printf("Bread contains: flour: %d, salt: %d, water: %d, oil: %d, gluten: %d%n"
        , getFlour(), getSalt(), getWater(), getSunflowerOil(), getGluten());

    }

    @Override
    public void garlicBaking() {
        System.out.printf("Garlic bread contains: flour: %d, salt: %d, water: %d, oil: %d, gluten: %d and a little garlic.%n"
                , getFlour()+100, getSalt()+1, getWater()-200, getSunflowerOil()-10, getGluten()-10);
    }
}
