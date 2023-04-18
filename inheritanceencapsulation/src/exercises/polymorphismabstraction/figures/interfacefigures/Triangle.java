package exercises.polymorphismabstraction.figures.interfacefigures;

public class Triangle extends Figure implements IManipulator {

    public Triangle(int side1, int side2, int side3, String type) {
        super(side1, side2, side3, type);
    }

    @Override
    public void revealType() {
        System.out.println("I am " + getType() + " with perimeter " + calculatePerimeter());
    }

    @Override
    public int calculatePerimeter() {
        return getSide1() + getSide2() + getSide3();
    }
}
