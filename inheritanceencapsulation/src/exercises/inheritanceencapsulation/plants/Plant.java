package exercises.inheritanceencapsulation.plants;

public class Plant {

    String name;
    boolean isProtected;
    int age;
    int score;

    public Plant(String name, boolean isProtected, int age, int score) {
        this.name = name;
        this.isProtected = isProtected;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", isProtected=" + isProtected +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Plant() {

    }
}
