package exercises.polymorphismabstraction.teacherstudentdog;

import java.util.Random;

public class Dog implements IEatingHomework {

    private String name;
    private String breed;

    public Dog (String name, String breed) {
        this.name = name;
        this.breed = breed;

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean eating() {
        Random random = new Random();
        boolean eat = random.nextBoolean();
        return eat;
    }
}
