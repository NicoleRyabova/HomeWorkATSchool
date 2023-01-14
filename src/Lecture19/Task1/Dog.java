package Lecture19.Task1;

public class Dog extends Animal {
    static int counter;

    public Dog(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        super(name, food, foodCounter, location, Dog.counter = counter + 1, health);
    }
}
