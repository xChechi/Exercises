package exercises.inheritanceencapsulation.movies;

public class MainMovies {

    public static void main(String[] args) {

        String[] winningMovies = {"Catch me if you can", "The Godfather", "Titanic"};
        String[] regularMovies = {"An American Hippie in Israel", "Caligula", "Zaat", "One man"};

        Director[] directors = {
                new Director("Ivan", new String[]{"Catch me if you can", "The Godfather", "An American Hippie in Israel", "Zaat "}, new String[]{"Catch me if you can", "The Godfather"}),
                new Director("Ivana", new String[]{"Titanic"}, new String[]{"Titanic"}),
                new Director("Alex", new String[]{"Caligula"}, new String[]{}),
                new Director("Stamat", new String[]{"One man"}, new String[]{})
        };


        Actor[] actors = {
                new Actor("Georgi", new String[]{"Frank Abagnale", "Vito Corleone"}, new String[]{"Catch me if you can", "The Godfather", "An American Hippie in Israel", "Zaat "}),
                new Actor("Gergana", new String[]{"Frank Abagnale", "Vito Corleone", "Jack"}, new String[]{"Catch me if you can", "The Godfather", "Titanic"}),
                new Actor("Toni", new String[]{}, new String[]{"An American Hippie in Israel", "Caligula", "Zaat ", "One man"})
        };

        for (Director director : directors) {
            System.out.print("Director " + director.name + " has worked with: ");
            for (Actor actor : actors) {
                if (actor.hasWorkedWith(director)) {
                    System.out.print(actor.name + " ");
                }
            }
            System.out.println();
        }

    }
}
