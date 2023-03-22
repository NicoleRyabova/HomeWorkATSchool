package Lecture75.Task2.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {

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

    public Orange() {
        freshness = Freshness.FRESH;
        weight = 2.1;
        price = new BigDecimal(110);
        name = "Orange";
    }
}