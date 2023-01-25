package Lecture39.Task1;
/*Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
 Создать максимально возможное количество конструкторов с разным кол-вом входных параметров(0,1,2,3,4),
  входные параметры не менять местами. Создать котиков в методе Main и вывести на их экран.
  Не забываем про метод toString() для котов.*/

public class Cat {
    private String eyeColor, coatColor;
    private double age;
    private int weight;

    public Cat() {
    }

    public Cat(double age) {
        this.age = age;
    }

    public Cat(double age, String eyeColor) {
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Cat(double age, String eyeColor, int weight) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Cat(double age, String eyeColor, int weight, String coatColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.coatColor = coatColor;

    }

    public String toString() {
        return "Cat: " +
                "age = " + age +
                ", eyeColor = " + eyeColor + '\'' +
                ", weight = " + weight +
                ", coatColor = " + coatColor + '\'';
    }
}
