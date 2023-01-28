package Lecture39.Task1;
/*Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
 Создать максимально возможное количество конструкторов с разным кол-вом входных параметров(0,1,2,3,4),
  входные параметры не менять местами. Создать котиков в методе Main и вывести на их экран.
  Не забываем про метод toString() для котов.*/

public class Cat {
    private String eyeColor, coatColor;
    private int age;
    private double weight;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String eyeColor) {
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Cat(int age, String eyeColor, double weight) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Cat(int age, String eyeColor, double weight, String coatColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;
    }

    public Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(String eyeColor, double weight) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Cat(String eyeColor, String coatColor) {
        this.eyeColor = eyeColor;
        this.coatColor = coatColor;
    }

    public Cat(double weight) {
        this.weight = weight;
    }
    //Я бы добавила еще конструкторы, но в задании сказано не менять местами параметры
    public String toString() {
        return "Cat: " +
                "age = " + age +
                ", eyeColor = " + eyeColor + '\'' +
                ", weight = " + weight +
                ", coatColor = " + coatColor + '\'';
    }
}
