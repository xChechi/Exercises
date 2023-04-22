package exercises.solid.crazyprofessor;

import java.util.Map;

public class MainCrazyProfessor {

    public static void main(String[] args) {

        Map<String, Boolean> list =  Students.showStudents();

        System.out.print("Students: ");
        for (String name : list.keySet()) {

            System.out.print(" " + name);
        }

        System.out.println("");
        for (Map.Entry<String, Boolean> entry : list.entrySet()) {
            String name = entry.getKey();
            Boolean present = entry.getValue();

            String condition;
            condition = (present) ? "on time" : "is late";

            System.out.println(name + " - " + condition);
        }
        int counter = 0;
        for (Boolean b : list.values()) {
            if (b) {
                counter++;
            }
        }

        if (counter > list.size()/2) {
            System.out.println("Professor is coming in class");
        } else System.out.println("Professor is going to Playboy");
    }

}
