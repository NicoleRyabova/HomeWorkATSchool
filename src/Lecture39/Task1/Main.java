package Lecture39.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(5);
        Cat cat3 = new Cat(4, "Yellow");
        Cat cat4 = new Cat(6, "Green", 12);
        Cat cat5 = new Cat(6, "Green", 12, "Grey");
        Cat cat6 = new Cat("Black");
        Cat cat7 = new Cat("Yellow", 6.0);
        Cat cat8 = new Cat("Green", "Grey");
        Cat cat9 = new Cat(9.0);
        Cat cat10 = new Cat(8, 3.5);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10};

        System.out.println("Task 1: " + '\n');
        // решила использовать for each для вывода объектов, так компактнее
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
