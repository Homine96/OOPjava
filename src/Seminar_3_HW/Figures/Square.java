package Seminar_3_HW.Figures;

import Seminar_3_HW.Except.IncorrectTriangle;
import Seminar_3_HW.Except.NegativeValue;

public class Square extends Rectangle{
    
    public Square(int side) throws NegativeValue, IncorrectTriangle{
        super(side, side);
    }

    public Square() throws NegativeValue, IncorrectTriangle{
        this(6);
    }

    @Override
    public String toString() {
        return String.format("Квадрат\nСторона: %d", sides[0]);
    }
}
