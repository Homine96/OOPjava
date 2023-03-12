package Seminar2_HW.Animal;

import Seminar2_HW.Abstract.HomeAnimal;

public class Cat extends HomeAnimal {

    private String wool;

    public Cat(int height, int weight, String eyeColor, String name, String breed, String vaccine, String colorwool,
            String date, String wool) {
        super(height, weight, eyeColor, name, breed, vaccine, colorwool, date);
        this.wool = wool;
        
    }

    public Cat(){
        this(20, 5, "green", "Murzik", "Hoome", "yes", "black", "3/04/2019", "yes");
    }

    // public String getInfo() {
    //     return String.format(" %s Wool: %s ",
    //             super.getInfo(), this.wool );
    // }

    public String toString() {
        return String.format(" %s Wool: %s ",
                super.toString(), this.wool );
    }

    @Override
    public void showAffection() {
        System.out.println("Мурчит");;
    }

    @Override
    public void makeSound() {
       System.out.println("Мяу!");;
    }
    
}
