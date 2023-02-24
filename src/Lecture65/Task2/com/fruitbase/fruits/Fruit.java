package Lecture65.Task2.com.fruitbase.fruits;

import java.math.BigDecimal;

//- классы видов фруктов в пакете с классом Fruit
//    находятся в пакете com.fruitbase.fruits
//    Apple
//    Orange
//    Banana
//    Pineapple
//    Каждый класс наследуется от Fruit
//    В конструкторе класса устанавливаются значения веса, цены, названия для фрукта
//
//Вес измеряется в кг и имеет тип double. Цена измеряется в у.е. и имеет тип BigDecimal.
public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;

    public abstract double getWeight();

    public abstract BigDecimal getPrice();

    public abstract String getName();
}
