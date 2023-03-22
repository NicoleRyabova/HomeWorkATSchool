package Lecture75.Task2.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;

    protected Freshness freshness;

    public boolean isFresh() {
        return freshness.equals(Freshness.FRESH);
    }

    public abstract double getWeight();

    public abstract BigDecimal getPrice();

    public abstract String getName();
}
