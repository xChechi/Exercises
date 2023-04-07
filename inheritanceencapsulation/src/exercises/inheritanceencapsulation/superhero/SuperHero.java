package exercises.inheritanceencapsulation.superhero;

public class SuperHero extends Person{

    String identity;

    public SuperHero(String name, int age, String identity) {
        super(name, age);
        this.identity = identity;
    }

    public SuperHero() {

    }

    public void saveWorld() {
        System.out.println("The world is saved now");
    }

    public void answering() {
        System.out.println("Yes, I am Peter, The Wonder Man");
    }

    public void hiddenAnswer() {
        System.out.println("Hi, I am Peter");
    }
}
