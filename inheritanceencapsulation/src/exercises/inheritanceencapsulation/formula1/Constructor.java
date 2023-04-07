package exercises.inheritanceencapsulation.formula1;

public class Constructor {

    String name;
    int winRaces;
    int winCars;

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", winRaces=" + winRaces +
                ", winCars=" + winCars +
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

    public int getWinCars() {
        return winCars;
    }

    public void setWinCars(int winCars) {
        this.winCars = winCars;
    }

    public Constructor(String name, int winRaces, int winCars) {
        this.name = name;
        this.winRaces = winRaces;
        this.winCars = winCars;
    }
}
