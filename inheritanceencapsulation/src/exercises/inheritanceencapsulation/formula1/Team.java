package exercises.inheritanceencapsulation.formula1;

public class Team {

    String name;
    Pilot pilot;
    Constructor constructor;
    int points;

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", pilot=" + pilot +
                ", constructor=" + constructor +
                ", points=" + points +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team(String name, Pilot pilot, Constructor constructor, int points) {
        this.name = name;
        this.pilot = pilot;
        this.constructor = constructor;
        this.points = points;
    }
}
