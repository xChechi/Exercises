package exercises.polymorphismabstraction.figures.abstractfigures;

public abstract class AbstractFigure {

    private int sides1;
    private int sides2;
    private int sides3;
    private int sides4;
    private int sides5;
    private String type;

    public AbstractFigure(int sides1, int sides2, int sides3, String type) {
        this.sides1 = sides1;
        this.sides2 = sides2;
        this.sides3 = sides3;
        this.type = type;
    }

    public AbstractFigure(int sides1, int sides2, int sides3, int sides4, String type) {
        this.sides1 = sides1;
        this.sides2 = sides2;
        this.sides3 = sides3;
        this.sides4 = sides4;
        this.type = type;
    }

    public AbstractFigure(int sides1, int sides2, int sides3, int sides4, int sides5, String type) {
        this.sides1 = sides1;
        this.sides2 = sides2;
        this.sides3 = sides3;
        this.sides4 = sides4;
        this.sides5 = sides5;
        this.type = type;
    }

    public int getSides1() {
        return sides1;
    }

    public int getSides2() {
        return sides2;
    }

    public int getSides3() {
        return sides3;
    }

    public int getSides4() {
        return sides4;
    }

    public int getSides5() {
        return sides5;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AbstractFigure{" +
                "sides1=" + sides1 +
                ", sides2=" + sides2 +
                ", sides3=" + sides3 +
                ", sides4=" + sides4 +
                ", sides5=" + sides5 +
                ", type='" + type + '\'' +
                '}';
    }

    abstract void revealType();
    abstract int calculatePerimeter();
}
