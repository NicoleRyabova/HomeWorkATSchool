package Lecture19.Task1;

public abstract class Animal {
    //Создание переменных для каждого животного
    String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected int counter;
    protected HealthState health;

    public Animal(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }

    //Методы для переопределения
    void makeSound() {
        System.out.println(name + " is purring");
    }

    void eat() {
        System.out.println(name + " is eating " + food);
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    //Метод для вывода сообщения
    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "food = " + food + '\n' +
                "food counter = " + foodCounter + '\n' +
                "location = " + location + '\n' +
                "counter = " + counter + '\n' +
                "health = " + health;
    }
}
