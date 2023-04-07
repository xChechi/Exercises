package exercises.inheritanceencapsulation.figures;

public class MainFigures {

    public static void main(String[] args) {

            Box box1 = new Box(5,5,5);
            Box box2 = new Box(0,0,0);
            Box box3 = new Box(10,5,2);
            Box box4 = new Box(10,-2,3);

            box1.printBox();
            box2.printBox();
            box3.printBox();
            box4.printBox();

    }


}
