package exercises.solid.personaddress;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Person {

    private String name;
    private int age;
    protected Map<String, List<String>> locations;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.locations = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void identify();
}
