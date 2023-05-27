package Lecture7_9.Vegetables;

import java.util.Random;

public class Cucumber implements Vegetable {

    @Override
    public String getName() {
        return "Огурец";
    }

    @Override
    public int hashCode() { //переопределили хэшкод
        Random random = new Random();
        return random.nextInt();
    }
}
