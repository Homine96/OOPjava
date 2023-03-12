package Seminar2_HW.Birds;

import Seminar2_HW.Abstract.Birds;

public class Hen extends Birds {

    public Hen(int height, int weight, String eyeColor, int h) {
        super(height, weight, eyeColor, h);
        
    }

    public Hen(){
        super(30, 3, "braun", 0);
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать");;
    }

    @Override
    public void makeSound() {
        System.out.println("Ko-ko-ko");;
    }

    // public String getInfo() {
    //     return String.format("%s  ",
    //             super.getInfo());
    // }

    public String toString() {
        return String.format("%s  ",
                super.toString());
    }
    
}
