package exercises.polymorphismabstraction.figures.interfacefigures;



public class MainInterfaceFigures {

    public static void main(String[] args) {

        Figure triangle = new Triangle(3, 4, 5, "triangle");
        Figure tetragon = new Tetragon(6, 7, 8, "tetragon", 9);
        Figure pentagon = new Pentagon(10,11,12,"pentagon",14, 13 );

        Figure[] allData = {triangle, tetragon, pentagon};

        for (Figure f : allData) {
            if (f instanceof Triangle) {
                ((Triangle) f).revealType();
            } else if (f instanceof Tetragon) {
                ((Tetragon) f).revealType();
            } else if (f instanceof Pentagon) {
                ((Pentagon) f).revealType();
            }
        }

    }

}
