  
/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog spike = new Dog("Spike","Gray","Funny");
        Cat butch = new Cat("Butch", null,"75");
        Person mommy = new Person("Mommy two Shoes","90","USA");
        Cat tom = new Cat("Tom",mommy,"80");

    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}

class Dog{
    String name;
    String color;
    String spirit;

    public Dog(String name, String color, String spirit) {
        this.name = name;
        this.color = color;
        this.spirit = spirit;
    }
}

class Cat{
    String name;
    String owner;
    int age;

    public Cat(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }
}

class Person{
    String name;
    int age;
    String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }
}
