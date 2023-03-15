package Seminar_3_HW.Figures;

import Seminar_3_HW.Except.NegativeValue;
import Seminar_3_HW.Figures.Base.Figure;
import Seminar_3_HW.Figures.Base.Lengthable;

public class Circle extends Figure implements Lengthable {
    private int radius;

    public Circle(int radius) throws NegativeValue {
        if (radius <= 0) throw new NegativeValue("Radius must be more than zero");
        this.radius = radius;
    }

    public Circle() throws NegativeValue{
        this.radius = 7;
    }

    @Override
    public double length() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Круг\nРадиус: %d", this.radius);
    }

}