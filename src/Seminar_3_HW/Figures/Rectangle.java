package Seminar_3_HW.Figures;

import Seminar_3_HW.Except.IncorrectTriangle;
import Seminar_3_HW.Except.NegativeValue;
import Seminar_3_HW.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(int sideA, int sideB) throws NegativeValue, IncorrectTriangle{
        super(new int[] { sideA, sideB, sideA, sideB });
    }

    public Rectangle() throws NegativeValue, IncorrectTriangle{
        this(3, 4);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }
    

    @Override
    public String toString() {
        return String.format("Прямоугольник\nСторона a: %d\nСторона b: %d", sides[0], sides[1]);
    }
}
