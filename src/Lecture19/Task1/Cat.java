package Lecture19.Task1;

public class Cat extends Animal {
    static int counter;
    public Cat(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        super(name, food, foodCounter, location, Cat.counter = counter + 1, health);
    }
}
