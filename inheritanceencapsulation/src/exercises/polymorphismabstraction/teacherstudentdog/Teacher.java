package exercises.polymorphismabstraction.teacherstudentdog;

import java.util.Arrays;
import java.util.Random;

public class Teacher extends Person {

    private String[] subject;

    public Teacher(String name, int years, String[] subject) {
        super(name, years);
        this.subject = subject;
    }

    public String[] getSubject() {
        return subject;
    }


    @Override
    String identifyHimself() {
        Random random = new Random();
        int number = random.nextInt();
        String name;
        if (number % 2 == 0) {
            name = Arrays.stream(subject).findFirst().orElse(null);
        } else {
            name = Arrays.stream(subject).reduce((first, second) -> second).orElse(null);
        }
        System.out.printf("%s: I am your teacher mr. %s and this is my %s class%n",getName(), getName(), name);
        return name;
    }

    @Override
    boolean homework() {
        System.out.printf(getName() + ": Is the homework ready?%n");
        return true;
    }
}
