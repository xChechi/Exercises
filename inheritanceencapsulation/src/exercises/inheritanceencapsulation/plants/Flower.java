package exercises.inheritanceencapsulation.plants;

import java.util.Random;

public class Flower extends Plant {

    boolean isBlossom;



    public Flower(String name, boolean isProtected, int age, int score) {
        super(name, isProtected, age, score);
    }

    public void isBlossom() {
        Random random = new Random();
        this.isBlossom = random.nextBoolean();
    }

    public Flower(String name, boolean isProtected, int age, int score, boolean isBlossom) {
        super(name, isProtected, age, score);

    }


}
