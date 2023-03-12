package Seminar2_HW.Animal;

import Seminar2_HW.Abstract.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(int height, int weight, String eyeColor, String habitat, String dateoflocation) {
        super(height, weight, eyeColor, habitat, dateoflocation);
        
    }

    public Tiger (){
        super(140, 50, "gray", "forest_siberya", "12/03/2000");
    }

    @Override
    public void makeSound() {
        System.out.println("rrrrrrrrrr");;
    }
    
}
