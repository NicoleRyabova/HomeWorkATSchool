package Lecture75.Task2.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit {

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

    public Pineapple() {
        freshness = Freshness.FRESH;
        weight = 4.1;
        price = new BigDecimal(340);
        name = "Pineapple";
    }
}
