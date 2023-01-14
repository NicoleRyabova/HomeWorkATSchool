package Lecture19.Task1;

public class Horse extends Animal {
    static int counter;

    public Horse(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        super(name, food, foodCounter, location, Horse.counter = counter + 1, health);
    }
}
