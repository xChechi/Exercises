package exercises.polymorphismabstraction.teacherstudentdog;

public abstract class Person {

    private String name;
    private int years;

    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    abstract String identifyHimself();
    abstract boolean homework();
}
