package exercises.solid.crazyprofessor;

import java.util.Map;

public class MainCrazyProfessor {

    public static void main(String[] args) {

        Map<String, Boolean> list =  Students.showStudents();

        int counter = 0;
        for (Boolean b : list.values()) {
            if (b) {
                counter++;
            }
        }

        System.out.print("Students: ");
        for (String name : list.keySet()) {

            System.out.print(" " + name);
        }

        System.out.println("");
        for (Map.Entry<String, Boolean> entry : list.entrySet()) {
            String name = entry.getKey();
            Boolean present = entry.getValue();
            String condition;
            if (present) {
                condition = "on time";
            } else condition = "is late";
            System.out.println(name + " - " + condition);
        }

        if (counter > list.size()/2) {
            System.out.println("Professor is coming in class");
        } else System.out.println("Professor is going to Playboy");
    }

}
