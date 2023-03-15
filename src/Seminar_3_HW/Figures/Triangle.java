package Seminar_3_HW.Figures;

import Seminar_3_HW.Except.IncorrectTriangle;
import Seminar_3_HW.Except.NegativeValue;
import Seminar_3_HW.Figures.Base.Polygon;

public class Triangle extends Polygon {
    public Triangle(int a, int b, int c) throws NegativeValue, IncorrectTriangle {
        super(new int[] { a, b, c });
    }

    public Triangle() throws NegativeValue, IncorrectTriangle {
        this(3, 4, 5);
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double side1 = sides[0];
        double side2 = sides[1];
        double side3 = sides[2];
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return String.format("Треугольник\nСторона a: %d\nСторона b: %d\nСторона c: %d", sides[0], sides[1],
                sides[2]);
    }

    
}
