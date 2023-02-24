package Lecture65.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Banana() {
        weight = 3.5;
        price = new BigDecimal(140);
        name = "Banana";
    }
}
