package exercises.inheritanceencapsulation.itcompany;

public class Developer extends Person {

        String knowledge;

    public String getKnowledge() {
        return knowledge;
    }

    public Developer(String name, int salary, String knowledge) {
        super(name, salary);
        this.knowledge = knowledge;
    }
}
