package exercises.solid.personaddress;

public class MainPersonAddress {

    public static void main(String[] args) {

        Adult ivan = new Adult("Ivan", 35, "painting");
        ivan.getLocation();
        ivan.identify();

        Child rado = new Child("Rado", 9, "orange");
        rado.identify();

    }
}
