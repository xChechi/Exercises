package exercises.polymorphismabstraction.songbooks.abstractsongbooks;

public class Song extends Media {

    private int duration;

    public Song(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String pageDeduction() {
        return null;
    }

    @Override
    public void durationIncrease() {
        System.out.printf("The original %s is %d minutes long.%nNow is %d minutes long.%n"
                , getTitle(), getDuration(), getDuration()+1);
    }
}
