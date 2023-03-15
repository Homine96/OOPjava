package Seminar_3_HW.Figures.Base;

import Seminar_3_HW.Except.IncorrectTriangle;
import Seminar_3_HW.Except.NegativeValue;

public abstract class Polygon extends Figure implements Perimetrable {
    protected int[] sides;

    protected Polygon(int[] sides) throws NegativeValue, IncorrectTriangle {
        if (hasNegative(sides))
            throw new NegativeValue("Value must be more than zero");
        if (sides.length == 3 && !isTriangle(sides))
            throw new IncorrectTriangle("Triangle is incorrect");
        this.sides = sides;
    }

    @Override
    public double perimeter() {
        double result = 0;
        for (int side : sides) {
            result += side;
        }
        return result;
    }

    private boolean hasNegative(int[] sides) {
        boolean result = false;
        for (int side : sides) {
            if (side < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean isTriangle(int[] sides) {
        if (sides[0] + sides[1] <= sides[2]
                || sides[0] + sides[2] <= sides[1]
                || sides[2] + sides[1] <= sides[0])
            return false;
        else
            return true;
    }
}