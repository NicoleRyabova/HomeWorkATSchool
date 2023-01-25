package Lecture39.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5);
        Cat cat3 = new Cat(4, "Yellow");
        Cat cat4 = new Cat(6, "Green", 12);
        Cat cat5 = new Cat(6, "Green", 12, "Grey");

        System.out.println("Task 1: " + '\n');
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println(cat5);
    }
}
