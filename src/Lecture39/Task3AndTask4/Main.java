package Lecture39.Task3AndTask4;

import static Lecture39.Task3AndTask4.Animal.testStaticMethod;

public class Main {
    public static void main(String[] args) {
        //task 3
        System.out.println("Task 3: " + '\n');
        testStaticMethod();
        Cat.testStaticMethod();
        Animal.testStaticMethod();

        //task 4
        System.out.println('\n' + "Task 4:");
        System.out.println(Animal.spaceObject);
        Cat.spaceObject = "Moon";
        System.out.println(Cat.spaceObject);
    }
}