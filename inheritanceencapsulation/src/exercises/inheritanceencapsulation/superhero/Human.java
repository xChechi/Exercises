package exercises.inheritanceencapsulation.superhero;

public class Human extends Person {

    public Human(String name, int age) {
        super(name, age);
    }

    public Human() {
        super();
    }

    public void greeting() {
        System.out.println("Hi, I am Nancy");
    }

    public void asking() {
        System.out.println("Are you a superhero?");
    }
}
