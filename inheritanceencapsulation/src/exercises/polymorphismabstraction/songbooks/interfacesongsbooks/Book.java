package exercises.polymorphismabstraction.songbooks.interfacesongsbooks;

public class Book implements IManipulator{
    private String title;
    private String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void changes() {
        System.out.printf("The original %s has %d pages.%nNow it has %d pages.%n"
                , getTitle(), getPages(), getPages()-50);
    }
}
