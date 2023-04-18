package exercises.polymorphismabstraction.teacherstudentdog;

import java.util.Random;

public class Pupil extends Person {

    private int[] mark;
    private Dog dog;


    public Pupil(String name, int years, int[] evaluation, Dog dog) {
        super(name, years);
        this.mark = evaluation;
        this.dog = dog;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    String identifyHimself() {
        return String.valueOf(System.out.printf("%s: Hello, my name is %s%n", getName(), getName()));
    }

    @Override
    boolean homework() {
        Random random = new Random();
        boolean homework = random.nextBoolean();
        return homework;
    }
}
