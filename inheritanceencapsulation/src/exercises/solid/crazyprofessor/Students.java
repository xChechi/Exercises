package exercises.solid.crazyprofessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Students {

    public static Map<String, Boolean> showStudents() {

        Map<String, Boolean> students = new HashMap<>();

        present(students, "Ivan");
        present(students, "Spas");
        present(students, "Ivana");
        present(students, "Spasimira");
        present(students, "Gergana");

        return students;
    }

    private static void present(Map<String, Boolean> students, String name) {
        Random random = new Random();
        boolean inClass = random.nextBoolean();
        students.put(name, inClass);
    }
}