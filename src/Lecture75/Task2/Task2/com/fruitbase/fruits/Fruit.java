package Lecture75.Task2.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

//Для фруктов нужно добавить
//    - внутренний параметр freshness - отражает состояние свежести фрукта;
//      для значений нужно завести enum с как минимум состояниями: FRESH, OVERRIPED, SPOILED
//      при создании объект имеет состояние FRESH
//    - метод equals
//    - метод hashcode
//    - метод isFresh - возвращает true, если параметр freshness имеет состояние FRESH
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
