package exercises.polymorphismabstraction.figures.interfacefigures;

public class Figure {

    private int side1;
    private int side2;
    private int side3;
    private String type;

    public Figure(int side1, int side2, int side3, String type) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = type;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", type='" + type + '\'' +
                '}';
    }
}
