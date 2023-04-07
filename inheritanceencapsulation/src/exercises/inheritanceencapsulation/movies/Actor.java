package exercises.inheritanceencapsulation.movies;

public class Actor {

    String name;
    String[] winningRoles;
    String[] movies;

    public Actor(String name, String[] winningRoles, String[] movies) {
        this.name = name;
        this.winningRoles = winningRoles;
        this.movies = movies;
    }

    public boolean hasWorkedWith(Director director) {
        for (String movie : movies) {
            for (String movieDirected : director.moviesDirected) {
                if (movie.equals(movieDirected)) {
                    return true;
                }
            }
        }
        return false;
    }
}
