package Seminar2_HW.Abstract;

public abstract class HomeAnimal extends Animal {

    protected String name;
    protected String breed; // порода собак
    protected String vaccine;
    protected String colorwool;
    protected String date;

    public HomeAnimal(int height, int weight, String eyeColor, String name, String breed, String vaccine, String colorwool, String date ) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccine = vaccine;
        this.colorwool = colorwool;
        this.date = date;
    }

    public abstract void showAffection();

    // public String getInfo() {
    //     return String.format("%s Name: %s  Breed: %s  Vaccine: %s ColorWool: %s Date: %s ",
    //             super.getInfo(), this.name, this.breed, this.vaccine, this.colorwool, this.date );
    // }
    public String toString() {
        return String.format("%s Name: %s  Breed: %s  Vaccine: %s ColorWool: %s Date: %s ",
                super.toString(), this.name, this.breed, this.vaccine, this.colorwool, this.date );
    }
    
}
