package exercises.inheritanceencapsulation.formula1;

public class Pilot {

    String name;
    int winRaces;
    int experience;

    public Pilot(String name, int winRaces, int experience) {
        this.name = name;
        this.winRaces = winRaces;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", winRaces=" + winRaces +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinRaces() {
        return winRaces;
    }

    public void setWinRaces(int winRaces) {
        this.winRaces = winRaces;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
