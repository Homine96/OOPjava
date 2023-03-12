package Seminar2_HW.Abstract;

public abstract class Animal  {
    protected int height;
    protected int weight;
    protected String eyeColor;

    public Animal(int height, int weight, String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    // public String getInfo() {
    //     return String.format("Height: %d  Weight: %d  EyeColor: %s ",
    //             this.height, this.weight, this.eyeColor);
    // }

    @Override
    public String toString(){
        return String.format("Height: %d  Weight: %d  EyeColor: %s ",
                this.height, this.weight, this.eyeColor);
    }

    public abstract void makeSound();
}
