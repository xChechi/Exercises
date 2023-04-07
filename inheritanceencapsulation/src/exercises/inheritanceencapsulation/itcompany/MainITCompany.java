package exercises.inheritanceencapsulation.itcompany;

import java.util.Arrays;
import java.util.Comparator;

public class MainITCompany {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Ivan", 1500, 5);
        Manager manager2 = new Manager("Ivana", 2000, 10);
        Manager manager3 = new Manager("Alex", 2500, 15);

        Developer developer1 = new Developer("Ivo", 1000, "Java");
        Developer developer2 = new Developer("Iva", 1500, "Java, Python");
        Developer developer3 = new Developer("Georgi", 2000, "Java, Python, C");
        Developer developer4 = new Developer("Gergana", 1500, "Java, C");

        Manager[] managers = {manager1, manager2, manager3};
        Developer[] developers = {developer1, developer2, developer3, developer4};
        int counter = 0;

        Manager managerWithMostEmployees = Arrays.stream(managers).max(Comparator.comparingInt(m -> m.getEmployee())).orElse(null);

        String topManager = managerWithMostEmployees.getName();
        //System.out.println(topManager);

        Developer topDeveloper = Arrays.stream(developers)
                .max(Comparator.comparing(dev -> dev.getKnowledge().split(",").length))
                .orElse(null);
        //System.out.println(topDeveloper.name);

        //int maxEmployerCount = -1;
        //Manager managerWithMax = null;
        for (Manager m : managers) {
            if(m.getEmployee() >= 10) {
                //System.out.println(m.getEmployee());
                counter++;
            }
            /* For some reason this logic is not working properly
            int employeeCount = m.getEmployee();
            if (employeeCount > maxEmployerCount) {
                maxEmployerCount = employeeCount;
                managerWithMax = m;
            }

            */
            //System.out.println(managerWithMostEmployees);
        }
        //System.out.println(counter);

        for (Developer d : developers) {
            String[] lang = d.getKnowledge().split(",");
            //System.out.println(Arrays.toString(lang));
            if (lang.length >= 2) {
                //System.out.println(lang.length);
                counter++;
            }

        }
        int topManagerEmployeeNumber = managerWithMostEmployees.getEmployee();
        //System.out.println(counter);
        int bonus = 150 * counter;
        //System.out.println(bonus);

        System.out.printf("Spent money: %d%nThe top manager is: %s. He/She leads %d people.%nThe top developer is: %s. He/She knows: %s"
                , bonus, topManager, topManagerEmployeeNumber, topDeveloper.name, topDeveloper.knowledge );


    }
}
