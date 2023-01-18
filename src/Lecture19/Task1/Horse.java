package Lecture19.Task1;

public class Horse extends Animal {
    static int counter = 7;

    public Horse(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location,  health);
    }
    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "food = " + food + '\n' +
                "food counter = " + foodCounter + '\n' +
                "location = " + location + '\n' +
                "counter = " + (counter = counter + 1) + '\n' +
                "health = " + health;
    }
}
