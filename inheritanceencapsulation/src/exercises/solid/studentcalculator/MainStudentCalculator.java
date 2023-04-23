package exercises.solid.studentcalculator;

public class MainStudentCalculator {

    public static void main(String[] args) {

        int[] numbers = {15, 89, 2, 1, 76, 20};

        Ivan ivan = new Ivan();
        Georgi georgi = new Georgi();
        MasterMind masterMind = new MasterMind();

        Calculations[] myObjects = {ivan, georgi, masterMind};

        for (Calculations o : myObjects) {
            if (o instanceof Ivan) {
                System.out.printf("Ivan: The sum is %d%n", o.sum(numbers));
                System.out.printf("Ivan: The biggest number is %d%n", o.biggestNum(numbers));
                System.out.println("---------------------------");
            }
            if (o instanceof Georgi) {
                System.out.printf("Georgi: The sum is %d%n", o.sum(numbers));
                System.out.printf("Georgi: The biggest number is %d%n", o.biggestNum(numbers));
                System.out.println("---------------------------");
            }
            if (o instanceof MasterMind) {
                System.out.printf("The sum is %d%n", o.sum(numbers));
                System.out.printf("The biggest number is %d%n", o.biggestNum(numbers));
            }
        }
    }

}
