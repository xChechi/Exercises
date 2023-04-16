package exercises.polymorphismabstraction.songbooks.abstractsongbooks;

public class Book extends Media {

    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String pageDeduction() {
        return String.valueOf(System.out.printf("The original %s has %d pages.%nNow it has %d pages.%n"
                , getTitle(), getPages(), getPages()-50));
    }

    @Override
    public void durationIncrease() {

    }


}
