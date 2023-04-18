package exercises.polymorphismabstraction.figures.interfacefigures;

public class Pentagon extends Figure implements IManipulator {

    private int side4;
    private int side5;

    public Pentagon(int side1, int side2, int side3, String type, int side4, int side5) {
        super(side1, side2, side3, type);
        this.side4 = side4;
        this.side5 = side5;
    }

    public int getSide4() {
        return side4;
    }

    public int getSide5() {
        return side5;
    }

    @Override
    public void revealType() {
        System.out.println("I am " + getType() + " with perimeter " + calculatePerimeter());
    }

    @Override
    public int calculatePerimeter() {
        return getSide1() + getSide2() + getSide3() + getSide4() + getSide5();
    }
}
