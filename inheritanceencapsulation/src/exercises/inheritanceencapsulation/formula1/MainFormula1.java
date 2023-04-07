package exercises.inheritanceencapsulation.formula1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainFormula1 {

    public static void main(String[] args) {

        Team team1 = new Team("Mercedes", new Pilot("Bat Dancho", 0, 0), new Constructor("Garage One", 0, 0), 0);
        Team team2 = new Team("Red Bull", new Pilot("Nino", 0, 2), new Constructor("Djanta LTD", 0, 0), 0);
        Team team3 = new Team("Ferrari", new Pilot("Chechi", 0, 2), new Constructor("Auspuha mi padna", 0, 0), 0);
        Team team4 = new Team("McLaren", new Pilot("Blind Monk", 0, 8), new Constructor("Where is my hammer", 0, 0), 0);

        Team[] teams = {team1, team2, team3, team4};
        //Collections.shuffle(Arrays.asList(teams));

        Random random = new Random();


        for (int i = 0; i < 22; i++) {
            int index1 = random.nextInt(teams.length);
            int index2 = random.nextInt(teams.length);

            // Swap the elements at index1 and index2
            Team temp = teams[index1];
            teams[index1] = teams[index2];
            teams[index2] = temp;

            // Update points, winRaces, and winCars for swapped teams
            temp.setPoints(temp.getPoints() + 25);
            temp.pilot.setWinRaces(temp.pilot.getWinRaces() + 1);
            temp.constructor.setWinCars(temp.constructor.getWinCars() + 1);

            teams[(index1 + 1) % teams.length].setPoints(teams[(index1 + 1) % teams.length].points + 18);
            teams[(index1 + 2) % teams.length].setPoints(teams[(index1 + 2) % teams.length].points + 15);

            System.out.println(Arrays.toString(teams));
        }

        int highestScore = Arrays.stream(teams).mapToInt(Team::getPoints).max().orElse(0); // p -> p.getScore() replaced with method reference

        List<Team> highestScoredTeam = Arrays.stream(teams).filter(p -> p.getPoints() == highestScore).collect(Collectors.toList());

        for (Team t : highestScoredTeam) {
            //System.out.println(t.getName() + " has the highest score of " + highestScore);
            System.out.printf("%s has the highest score of %d points, with pilot %s who won %d races and constructor \"%s\" with %d winning cars"
                                , t.getName(), highestScore, t.pilot.getName(), t.pilot.getWinRaces(), t.constructor.getName(), t.constructor.getWinCars());
        }

    }

}
