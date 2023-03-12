package Seminar2_HW.Animal;

import Seminar2_HW.Abstract.HomeAnimal;
import Seminar2_HW.Interface.Train;

public class Dog extends HomeAnimal implements Train {

    private String training;

    public Dog(int height, int weight, String eyeColor, String name, String breed, String vaccine, String colorwool,
            String date, String training) {
        super(height, weight, eyeColor, name, breed, vaccine, colorwool, date);
        this.training = training;
    }

    public Dog(){
        this(90, 15, "blue", "Rich", "Korgi", "yes", "white-braun", "12/01/2022", "Yes");
    }


        
    // public String getInfo() {
    //     return String.format("%s Training: %s ",
    //             super.getInfo(), this.training );
    // }

    public String toString() {
        return String.format("%s Training: %s ",
                super.toString(), this.training );
    }

    @Override
    public void showAffection() {
        System.out.println("Проявляю ласку");;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");;
    }

    @Override
    public void train() {
        System.out.println("Начинаем дрессировку!");;
    }
    
}