package exercises.inheritanceencapsulation.itcompany;

public class Person {

    String name;
    int salary;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
