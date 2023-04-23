package exercises.solid.personaddress;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Adult extends Person {

    private String hobby;

    public Adult(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void getLocation () {
        this.locations.put("Sofia", Arrays.asList("10 Pobeda Road", "5 Nadejda Road"));
        this.locations.put("Varna", Collections.singletonList("1 Lale Road"));
    }

    @Override
    public void identify() {
        System.out.println("My name is " + getName() + ". I am " + getAge() + " years old and my hobby is " + getHobby() + ".");
        System.out.println("My addresses are:");
        for (String city : locations.keySet()) {
            List<String> streets = locations.get(city);
            System.out.printf("In %s:\n", city);
            for (String street : streets) {
                System.out.println(street);
            }
        }
        System.out.println("------------------");
    }
}
