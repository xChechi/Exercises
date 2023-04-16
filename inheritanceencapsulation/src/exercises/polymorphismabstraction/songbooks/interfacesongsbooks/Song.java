package exercises.polymorphismabstraction.songbooks.interfacesongsbooks;

public class Song implements IManipulator {
    private String title;
    private String author;
    private int duration;

    public Song(String title, String author, int duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void changes() {
        System.out.printf("The original %s is %d minutes long.%nNow is %d minutes long.%n"
                , getTitle(), getDuration(), getDuration()+1);
    }
}
