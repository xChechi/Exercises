package exercises.inheritanceencapsulation.movies;

public class Director {

    String name;
    String[] moviesDirected;
    String[] winningMovies;

    public Director(String name, String[] moviesDirected, String[] winningMovies) {
        this.name = name;
        this.moviesDirected = moviesDirected;
        this.winningMovies = winningMovies;
    }
}
