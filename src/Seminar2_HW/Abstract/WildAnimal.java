package Seminar2_HW.Abstract;

public abstract class  WildAnimal extends Animal {

    protected String habitat;
    protected String dateoflocation;

    public WildAnimal(int height, int weight, String eyeColor, String habitat, String dateoflocation) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateoflocation = dateoflocation;
    }
    
    // public String getInfo() {
    //     return String.format("%s Habitat: %s  DateOfLocation: %s  ",
    //             super.getInfo(), this.habitat, this.dateoflocation);
    // }

    public String toString() {
        return String.format("%s Habitat: %s  DateOfLocation: %s  ",
                super.toString(), this.habitat, this.dateoflocation);
    }
}
