package exercises.polymorphismabstraction.stringmanipulator;

import java.util.Scanner;

public class MainStringManipulator {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any word");
        String input = scanner.nextLine();

        if (!input.contains(" ")) {
            //System.out.println("Correct");
            System.out.println(input.toLowerCase());
            System.out.println(input.toUpperCase());

            String result = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
            System.out.println(result);

            String result2 = input.replaceAll(".", "$0 ").toLowerCase();
            System.out.println(result2);

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                System.out.println(c + " is at position " + i);
            }
        } else {
            System.out.println("Just one word pls");
            scanner.nextLine();
        }

    }



}
