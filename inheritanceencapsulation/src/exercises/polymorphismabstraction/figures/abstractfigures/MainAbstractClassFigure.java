package exercises.polymorphismabstraction.figures.abstractfigures;

public class MainAbstractClassFigure {

    public static void main(String[] args) {

        Figure triangle = new Figure(3, 4, 5, "triangle");
        Figure tetragon = new Figure(6, 7, 8, 9, "tetragon");
        Figure pentagon = new Figure(10,11,12,13,14, "pentagon");

        Figure[] allData = {triangle, tetragon, pentagon};

        for (Figure f : allData) {
            f.revealType();
        }

    }
}
