package exercises.inheritanceencapsulation.plants;

import java.util.Random;

public class Tree extends Plant {

    boolean isFruit;


    public Tree(String name, boolean isProtected, int age, int score, boolean isFruit) {
        super(name, isProtected, age, score);
        this.isFruit = isFruit;
    }

    public Tree(String name, boolean isProtected, int age, int score) {
        super(name, isProtected, age, score);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", isProtected=" + isProtected +
                ", age=" + age +
                ", score=" + score +
                ", isFruit=" + isFruit +
                '}';
    }

    public void isFruit() {
        Random random = new Random();
        this.isFruit = random.nextBoolean();
    }
}
