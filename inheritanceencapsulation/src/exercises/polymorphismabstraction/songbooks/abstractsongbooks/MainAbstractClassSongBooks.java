package exercises.polymorphismabstraction.songbooks.abstractsongbooks;

public class MainAbstractClassSongBooks {

    public static void main(String[] args) {

        Media song1 = new Song("Vivir Me vida", "Marc Anthony", 2);
        Media song2 = new Song("Every breathe you take", "Sting", 3);

        Media book1 = new Book("The Kite Runner", "Khaled Hosseini", 350);
        Media book2 = new Book("Avalanche", "Blaga Dimitrova", 344);

        Author author1 = new Author("Marc Anthony", 60);
        Author author2 = new Author("Sting", 100);
        Author author3 = new Author("Khaled Hosseini", 4);
        Author author4 = new Author("Blaga Dimitrova", 30);

        Media[] allMedia = {song1, song2, book1, book2};

        for (Media media : allMedia) {
            if (media instanceof Song) {
                ((Song) media).durationIncrease();
            } else if (Book.class.isInstance(media)) {
                Book book = (Book) media;
                book.pageDeduction();
            }
        }
    }
}
