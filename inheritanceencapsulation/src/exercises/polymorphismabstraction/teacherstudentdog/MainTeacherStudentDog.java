package exercises.polymorphismabstraction.teacherstudentdog;

import java.util.Random;

public class MainTeacherStudentDog {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Daskalov", 45, new String[]{"Math", "Chemistry"});
        Teacher teacher2 = new Teacher("Sotirov", 62, new String[]{"Music", "Chemistry"});

        Pupil[] pupils = {
                new Pupil("Ivancho", 12, new int[]{3, 4, 5}, new Dog("Sharo", "mastia")),
                new Pupil("Mariika", 10, new int[]{6, 5, 6}, new Dog("Nikifor", "pincher")),
                new Pupil("Ganio", 11, new int[]{4, 5, 4}, new Dog("Unufri", "pitbull"))
        };

        Random random = new Random();

        for (Pupil pupil : pupils) {
            int n = random.nextInt(2);

            Teacher teacher;
            if (n == 0) {
                teacher = teacher1;
            } else {
                teacher = teacher2;
            }
            System.out.println(" ");
            String teacherSubject = teacher.identifyHimself();
            teacher.homework();
            pupil.identifyHimself();

            if (pupil.homework()) {
                System.out.println(pupil.getName() + ": This is my homework\n");
                int[] marks = pupil.getMark();
                updateMarks(marks, teacherSubject, 1);
                pupil.setMark(marks);
            } else if (pupil.getDog().eating()) {
                System.out.printf("%s: My dog ate it%n", pupil.getName());
                int[] marks = pupil.getMark();
                updateMarks(marks, teacherSubject, -1);
                pupil.setMark(marks);
            } else {
                System.out.printf("%s: I don't have homework%n", pupil.getName());
                int[] marks = pupil.getMark();
                switch (teacherSubject) {
                    case "Math":
                        marks[1] = 2;
                        break;
                    case "Chemistry":
                        marks[0] = 2;
                        break;
                    case "Music":
                        marks[2] = 2;
                        break;
                }
                pupil.setMark(marks);
            }
            System.out.println("------------------------------------------------------");
            System.out.printf("%s marks: Chemistry - %d, Math - %d, Music - %d%n"
                    , pupil.getName(), pupil.getMark()[0], pupil.getMark()[1], pupil.getMark()[2]);
        }
    }

    private static void updateMarks(int[] marks, String teacherSubject, int i) {

        if ("Math".equals(teacherSubject)) {
            marks[1] = Math.max(0, Math.min(6, marks[1] + i));
        } else if ("Chemistry".equals(teacherSubject)) {
            marks[0] = Math.max(0, Math.min(6, marks[0] + i));
        } else if ("Music".equals(teacherSubject)) {
            marks[2] = Math.max(0, Math.min(6, marks[2] + i));
        }
    }
}

