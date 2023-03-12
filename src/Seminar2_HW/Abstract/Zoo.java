package Seminar2_HW.Abstract;

import java.util.ArrayList;
import java.util.List;

import Seminar2_HW.Animal.Cat;
import Seminar2_HW.Animal.Dog;
import Seminar2_HW.Animal.Tiger;
import Seminar2_HW.Animal.Wolf;
import Seminar2_HW.Birds.Aist;
import Seminar2_HW.Birds.Hen;

public  class Zoo {
    
    public static  List <Animal> allAnimal = new ArrayList<>();

    public int size(){
        return allAnimal.size();
    }

    public void addCat(){
        Zoo.allAnimal.add(new Cat());

    }

    public void addDog(){
        Zoo.allAnimal.add(new Dog());

    }

    public void addTiger(){
        Zoo.allAnimal.add(new Tiger());

    }

    public void addWolf(){
        Zoo.allAnimal.add(new Wolf());

    }

    public void addAist(){
        Zoo.allAnimal.add(new Aist());

    }

    public void addHen(){
        Zoo.allAnimal.add(new Hen());

    }


    public void showAll(){
        int index = 0;
        for (Animal zoopark : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(zoopark);
            System.out.println("----");
            index++;
        }
    }

    public void removeAnimal(int num){
        allAnimal.remove(num);
    }

    public void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof HomeAnimal){
        ((HomeAnimal)allAnimal.get(num)).showAffection();
       }
       if (allAnimal.get(num) instanceof Birds){
        ((Birds)allAnimal.get(num)).fly();
       }  
    }

    public void makeSound(int num) {
        allAnimal.get(num).makeSound();
    }

    void sayMakeSound(){
        for (Animal zoopark : allAnimal) {
            zoopark.makeSound();
        }
    }

    public void sayAllAnimals() {
        for (Animal animal : allAnimal) {
            animal.makeSound();
        }
    }


}
