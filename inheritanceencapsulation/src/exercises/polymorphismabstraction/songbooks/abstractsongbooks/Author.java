package exercises.polymorphismabstraction.songbooks.abstractsongbooks;

public class Author {

    private String name;
    private int numberNovels;

    public Author(String name, int numberNovels) {
        this.name = name;
        this.numberNovels = numberNovels;
    }

    public String getName() {
        return name;
    }

    public int getNumberNovels() {
        return numberNovels;
    }
}
