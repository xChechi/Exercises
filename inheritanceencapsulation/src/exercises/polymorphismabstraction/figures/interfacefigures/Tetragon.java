package exercises.polymorphismabstraction.figures.interfacefigures;

public class Tetragon extends Figure implements IManipulator {

    private int side4;

    public Tetragon(int side1, int side2, int side3, String type, int side4) {
        super(side1, side2, side3, type);
        this.side4 = side4;
    }

    public int getSide4() {
        return side4;
    }

    @Override
    public void revealType() {
        System.out.println("I am " + getType() + " with perimeter " + calculatePerimeter());
    }

    @Override
    public int calculatePerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4();
    }
}
