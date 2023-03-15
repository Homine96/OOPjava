package Seminar_3_HW;

import Seminar_3_HW.Except.IncorrectTriangle;
import Seminar_3_HW.Except.NegativeValue;
import Seminar_3_HW.FigArr.FigArr;
import Seminar_3_HW.Figures.Circle;
import Seminar_3_HW.Figures.Rectangle;
import Seminar_3_HW.Figures.Square;
import Seminar_3_HW.Figures.Triangle;
import Seminar_3_HW.Figures.Base.Figure;

public class App {
    public static void main(String[] args)
            throws NegativeValue, IncorrectTriangle, NumberFormatException {

        
        FigArr<Figure> storage = new FigArr<>();

        
        Figure square = new Square(5);
        Figure rectangle = new Rectangle(6, 9);
        Figure triangle = new Triangle(3, 5, 7);
        Figure circle = new Circle(12);
        Figure sq = new Square();

        
        storage.add(square);
        storage.add(rectangle);
        storage.add(triangle);
        storage.add(circle);
        storage.add(sq);

        
        storage.delete(4);

        
        storage.sort();

        
        storage.showFigures();

        
        storage.showAll();

    }

}