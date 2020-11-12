/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main {
    public static void main(String[] args){
        Horse horse = new Horse("клейдесдальская","brown","male" );
        Pegasus pegasus = new Pegasus("мифическая","white","female");
        horse.run();
        pegasus.fly();
    }
}

abstract class Animal{
    private String breed;
    private String color;
    private String gender;

    public Animal(String breed, String color, String gender) {
        this.breed = breed;
        this.color = color;
        this.gender = gender;
    }
}

class Horse extends Animal{
    public Horse(String breed, String color, String gender) {
        super(breed, color, gender);
    }
    public void run() {System.out.println("Игого, я поскакал(а)");}

}

class Pegasus extends Horse{
    public Pegasus(String breed, String color, String gender) {
        super(breed, color, gender);
    }
    public void fly() {System.out.println("Игого, я полетел(а)");}
}
