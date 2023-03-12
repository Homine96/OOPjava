package Seminar2_HW;

import java.util.Scanner;

import Seminar2_HW.Abstract.Zoo;


public class App {
    public static void main(String[] args) throws Exception {
        
        Zoo zoopark = new Zoo();
        Scanner input = new Scanner(System.in);
        showMenu(zoopark, input);
        input.close();
     

        
    }


    private static void showMenu(Zoo zoopark, Scanner input) {
        System.out.println("1. Добавить животное в зоопарк");
        System.out.println("2. Удалить животное из зоопарка");
        System.out.println("3. Просмотреть информацию о конкретном животном");
        System.out.println("4. Заставить конкретное животное издать звук");
        System.out.println("5. Просмотреть информацию о всех животных в зоопарке");
        System.out.println("6. Заставить все животные в зоопарке издать звук");
        System.out.println("7. Выйти");
        System.out.print("Выберите пункт меню: ");

        int choice = input.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    addAnimal(zoopark, input);
                case 2:
                    removeAnimal(zoopark, input);
                case 3:
                    infoAnimal(zoopark, input);
                case 4:
                    sayAnimal(zoopark, input);
                case 5:
                    zoopark.showAll();
                case 6:
                    zoopark.sayAllAnimals();
                case 7:
                    input.close();
                    break;
            }
        }

    }

    private static void addAnimal(Zoo zoopark, Scanner input) {
        System.out.println("1. Добавить кота");
        System.out.println("2. Добавить тигра");
        System.out.println("3. Добавить собаку");
        System.out.println("4. Добавить волка");
        System.out.println("5. Добавить курицу");
        System.out.println("6. Добавить аиста");
        System.out.println("7. Назад");
        System.out.print("Выберите пункт меню: ");
        int choice = input.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    zoopark.addCat();
                    addAnimal(zoopark, input);
                case 2:
                    zoopark.addTiger();
                    addAnimal(zoopark, input);
                case 3:
                    zoopark.addDog();
                    addAnimal(zoopark, input);
                case 4:
                    zoopark.addWolf();
                    addAnimal(zoopark, input);
                case 5:
                    zoopark.addHen();
                    addAnimal(zoopark, input);
                case 6:
                    zoopark.addAist();
                    addAnimal(zoopark, input);
                case 7:
                    showMenu(zoopark, input);
            }
        }
        

    }

    private static void removeAnimal(Zoo zoopark, Scanner input) {
        zoopark.showAll();
        System.out.printf("%d) Назад\n", Zoo.allAnimal.size());
        System.out.print("Введите цифру кого хотите удалить: ");
        int choice = input.nextInt();
        if (choice < Zoo.allAnimal.size()) {
            zoopark.removeAnimal(choice);
            System.out.println("Вы успешно удалили животное!");
            showMenu(zoopark, input);
        } else
            showMenu(zoopark, input);

    }

    private static void infoAnimal(Zoo zoopark, Scanner input) {
        zoopark.showAll();
        System.out.printf("%d) Назад\n", Zoo.allAnimal.size());
        System.out.print("Введите цифру кого хотите посмотреть: ");
        int choice = input.nextInt();
        if (choice < Zoo.allAnimal.size()) {
            zoopark.showAnimal(choice);
            infoAnimal(zoopark, input);
        } else
            showMenu(zoopark, input);
    }

    private static void sayAnimal(Zoo zoopark, Scanner input) {
        zoopark.showAll();
        System.out.printf("%d) Назад\n", Zoo.allAnimal.size());
        System.out.print("Введите цифру кто должен произнести звук: ");
        int choice = input.nextInt();
        if (choice < Zoo.allAnimal.size()) {
            zoopark.makeSound(choice);
            sayAnimal(zoopark, input);
        } else
            showMenu(zoopark, input);
    }
}
