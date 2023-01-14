package Lecture19.Task1;

public class Main {
    public static void main(String[] args) {
        //Создание объектов Dog,Cat и Horse
        Dog dog = new Dog("Dog", "food for dogs", 5, "Apartment", 4, HealthState.HEALTHY);
        Cat cat = new Cat("Cat", "food for cats", 3, "Apartment", 1, HealthState.HEALTHY);
        Horse horse = new Horse("Horse", "food for horses", 10, "farm", 10, HealthState.UNHEALTHY);

        //Вывод методов у каждого объекта
        System.out.println(dog + String.format("%n"));
        dog.makeSound();
        dog.eat();
        dog.sleep();

        System.out.println(String.format("%n") + cat + String.format("%n"));
        cat.makeSound();
        cat.eat();
        cat.sleep();

        System.out.println(String.format("%n") + horse + String.format("%n"));
        horse.makeSound();
        horse.eat();
        horse.sleep();
        System.out.println();

        //Создание объекта ветерианара и вывод его методов
        Vet vet = new Vet("Alice");
        vet.treatAnimal(dog);
    }
}
