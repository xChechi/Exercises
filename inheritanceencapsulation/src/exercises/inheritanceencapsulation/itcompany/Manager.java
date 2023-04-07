package exercises.inheritanceencapsulation.itcompany;

public class Manager extends Person {

    int employee;

    public Manager() {
        super();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Manager(String name, int salary, int employee) {
        super(name, salary);
        this.employee = employee;
    }

    public int getEmployee() {
        return employee;
    }
}
