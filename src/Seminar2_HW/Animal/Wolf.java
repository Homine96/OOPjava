package Seminar2_HW.Animal;

import Seminar2_HW.Abstract.WildAnimal;

public class Wolf extends WildAnimal {

    private String leader;

    public Wolf(int height, int weight, String eyeColor, String habitat, String dateoflocation, String leader) {
        super(height, weight, eyeColor, habitat, dateoflocation);
        this.leader = leader;
    }

    public Wolf(){
        this(140, 20, "grey", "forest", "3/5/1995", "Leader");
    }

    @Override
    public void makeSound() {
        System.out.println("Auuuuuuu");;
    }

    // public String getInfo() {
    //     return String.format("%s Leader: %s  ",
    //             super.getInfo(), this.leader);
    // }

    public String toString() {
        return String.format("%s Leader: %s  ",
                super.toString(), this.leader);
    }
    
}
