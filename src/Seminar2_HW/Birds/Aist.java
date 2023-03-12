package Seminar2_HW.Birds;

import Seminar2_HW.Abstract.Birds;

public class Aist extends Birds  {

    public Aist(int height, int weight, String eyeColor, int h) {
        super(height, weight, eyeColor, h);
        
    }

    public Aist(){
        super(160, 10, "голубые", 30);
    }

    @Override
    public void fly() {
        System.out.printf("Я лечу на %d метрах \n", h);;
    }

    @Override
    public void makeSound() {
        System.out.println("Звук аиста");;
    }
    
}
