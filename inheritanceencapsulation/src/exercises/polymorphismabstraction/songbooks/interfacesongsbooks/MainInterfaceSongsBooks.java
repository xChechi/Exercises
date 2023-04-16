package exercises.polymorphismabstraction.songbooks.interfacesongsbooks;

public class MainInterfaceSongsBooks {

    public static void main(String[] args) {

        Song song1 = new Song("Vivir Me vida", "Marc Anthony", 2);
        Song song2 = new Song("Every breathe you take", "Sting", 3);

        Book book1 = new Book("The Kite Runner", "Khaled Hosseini", 350);
        Book book2 = new Book("Avalanche", "Blaga Dimitrova", 344);

        IManipulator[] overall = {song1, song2, book1, book2};

        for (IManipulator o : overall) {
            o.changes();
        }
    }
}
