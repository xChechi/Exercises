package exercises.inheritanceencapsulation.superhero;

import java.util.Random;

public class MainSuperHero {

    public static void main(String[] args) {

        Human human = new Human();
        SuperHero superHero = new SuperHero();

        Random random = new Random();
        int number = random.nextInt(100);

        System.out.println(number);

        if(number > 50) {
            superHero.saveWorld();
            human.asking();
            superHero.answering();
        } else {
            human.greeting();
            superHero.hiddenAnswer();
        }





    }
}
