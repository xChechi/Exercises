package exercises.solid.personaddress;

public class Child extends Person {

    private String color;

    public Child(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    void identify() {
        System.out.println("My name is " + getName() + ". I am " + getAge() + " years old and my favorite color is " + getColor() + ".");
        System.out.println("I'm a child, I won't tell you my address!");
    }
}
