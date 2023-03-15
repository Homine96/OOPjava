package Seminar_3_HW.FigArr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Seminar_3_HW.Figures.Base.Figure;
import Seminar_3_HW.Figures.Base.Lengthable;
import Seminar_3_HW.Figures.Base.Perimetrable;

public class FigArr<T extends Figure> {
    private List<T> storage = new ArrayList<T>();

    public void add(T obj) {
        this.storage.add(obj);
    }

    public void delete(int index) {
        this.storage.remove(index);
    }

    public void showFigures() {
        for (T figure : storage) {
            System.out.println(figure);
            System.out.println("------");
        }
    }

    public void showAll() {
        for (Figure figure : storage) {

            System.out.println(figure);
            System.out.printf("Площадь: %.2f\n", figure.area());
            if (figure instanceof Lengthable) {
                System.out.printf("Длина окружности: %.2f\n", ((Lengthable) figure).length());
            }
            if (figure instanceof Perimetrable) {
                System.out.printf("Периметр: %.2f\n", ((Perimetrable) figure).perimeter());
            }
            System.out.println("------");
        }

    }

    public void sort() {
        Collections.sort(this.storage);
    }

}