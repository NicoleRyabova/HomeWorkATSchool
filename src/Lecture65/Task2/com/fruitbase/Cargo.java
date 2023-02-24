package Lecture65.Task2.com.fruitbase;

import Lecture65.Task2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Stream;

//- класс Cargo
//    находится в пакете com.fruitbase
//    содержит поле массив Fruit - записи о фруктах, добавленных в груз
//    содержит консткрутор без параметров
//        в нем инициализируется внутренний массив
//    содержит общедоступный метод getWeight - возвращает суммарный вес груза
//    содержит общедоступный метод getPrice - возвращает суммарную цену груза
//    содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив
//
public class Cargo {
    Fruit[] fruits;


    public Cargo() {
        this.fruits = new Fruit[]{};
    }

    public double getWeight() {
        return Arrays.stream(fruits)
                .mapToDouble(fruit -> fruit.getWeight())
                .sum();
    }

    public BigDecimal getPrice() {
        return BigDecimal.valueOf(Arrays.stream(fruits)
                .mapToInt(fruit -> fruit.getPrice().intValue())
                .sum());
    }

    void addFruit(Fruit fruit) {
        fruits = mergeArrays(fruit);

    }

    private Fruit[] mergeArrays(Fruit fruit) {
        return Stream.concat(Arrays.stream(fruits), Arrays.stream(new Fruit[]{fruit}))
                .toArray(Fruit[]::new);
    }

    @Override
    public String toString() {
        return "общая цена: " + getPrice() + " Общий вес: " + getWeight();
    }

}
