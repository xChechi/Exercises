package exercises.solid.phonebook;

import java.util.*;

public class MainPhoneBook {

    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();

        phonebook.put("Ivan", 123456789);
        phonebook.put("Spas", 987654321);
        phonebook.put("Ivana", 159357486);
        phonebook.put("Spasimira", 357951426);

        Scanner scanner = new Scanner(System.in);
        System.out.println(""" 
                           What name are you looking for?
                                Press 1 for full name search
                                Press 2 for search by letters
                           """);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.println("Searching by fullname (one or more)");

                String input = scanner.nextLine();
                String formattedName = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
                String[] searchedNames = formattedName.split(("\\s*(,|\\sand\\s|\\s+)\\s*"));

                for (int i = 0; i < searchedNames.length; i++) {
                    String upperName = searchedNames[i];
                    searchedNames[i] = upperName.substring(0, 1).toUpperCase() + upperName.substring(1).toLowerCase();
                }

                System.out.println(Arrays.toString(searchedNames));
                List<String> filteredList = new ArrayList<>(Arrays.asList(searchedNames));
                // Version 3 - IntelliJ mi podava che s constructor call bilo oshte po pravilno
                // Version 2 - filteredList.addAll(Arrays.asList(searchedNames));
                /* Version 1 (moqta noob versiq) - Tova otgore e smart way da se napishe tova v komentara
                for (String s : searchedNames) {
                    filteredList.add(s);
                }
                 */

                for (String f : filteredList) {
                    if (phonebook.containsKey(f)) {
                        System.out.println(f + " - " + phonebook.get(f));
                    }
                }
            }
            case 2 -> {
                System.out.println("Searching by name segment");
                String input2 = scanner.nextLine();
                for (String name : phonebook.keySet()) {
                    if (name.toLowerCase().contains(input2.toLowerCase())) {
                        System.out.println(name + " - " + phonebook.get(name));
                    }
                }
            }
            default -> System.out.println("BEEP BEEP BEEP - Invalid input - MEGA SOFTWARE IS TERMINATED");
        }




    }

}
