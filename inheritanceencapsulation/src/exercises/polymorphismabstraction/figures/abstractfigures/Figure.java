package exercises.polymorphismabstraction.figures.abstractfigures;

public class Figure extends AbstractFigure {


    public Figure(int sides1, int sides2, int sides3, String type) {
        super(sides1, sides2, sides3, type);
    }

    public Figure(int sides1, int sides2, int sides3, int sides4, String type) {
        super(sides1, sides2, sides3, sides4, type);
    }

    public Figure(int sides1, int sides2, int sides3, int sides4, int sides5, String type) {
        super(sides1, sides2, sides3, sides4, sides5, type);
    }



    @Override
    void revealType() {
        System.out.println("I am " + getType() + " with perimeter " + calculatePerimeter());
    }

    @Override
    int calculatePerimeter() {
        int result = 0;

        if (getSides4() == 0) {
            result = getSides1() + getSides2() + getSides3();
        } else if (getSides5() == 0) {
            result = getSides1() + getSides2() + getSides3() + getSides4();
        } else result = getSides1() + getSides2() + getSides3() + getSides4() + getSides5();

        return result;
    }
}
