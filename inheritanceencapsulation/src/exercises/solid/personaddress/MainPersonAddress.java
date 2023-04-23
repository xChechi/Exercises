package exercises.solid.personaddress;

import java.util.*;

public class MainPersonAddress {

    public static void main(String[] args) {

        Adult ivan = new Adult("Ivan", 35, "painting") {{
            this.locations.put("Sofia", Arrays.asList("10 Pobeda Road", "5 Nadejda Road"));
            this.locations.put("Varna", Collections.singletonList("1 Lale Road"));
        }};
        ivan.identify();

        Child rado = new Child("Rado", 9, "orange");
        rado.identify();

    }
}
