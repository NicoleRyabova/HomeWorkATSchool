package Lecture7_9.Task2;

import Lecture7_9.Fruits.Apple;
import Lecture7_9.Fruits.Banana;
import Lecture7_9.Fruits.Fruit;
import Lecture7_9.Plant;
import Lecture7_9.Vegetables.Cucumber;
import Lecture7_9.Vegetables.Tomato;
import Lecture7_9.Vegetables.Vegetable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//Реализовать для корзины метод size, возвращающий, количество элементов в корзине.
//
//Реализовать класс с огурцами так, чтобы можно было добавить в одну и ту же корзину,
// в которую добавляем овощи, один и тот же огурец несколько раз.
// Помидоры не трогать.
// Другими словами, делаем одно поле с огурцом и одно поле с помидором в корзину для овощей (из третьего задания,
// в котором складываем всё в глобальное поле HashMap).
// Добавляем этот огурец три раза подряд и два раза подряд добавляем помидор,
// вызывая метод addItem.
// После этого вызываем метод size и он должен вывести ответ 4.
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        Vegetable tomato = new Tomato();
        Vegetable cucumber = new Cucumber();

        List<Plant> plants = new ArrayList<>(); //task3
        plants.add(apple);
        plants.add(banana);
        plants.add(tomato);
        plants.add(cucumber);

        HashMap<String, Plant> hashmapWithFruitsAngVeggies = new HashMap<>(); //task3

        plants.forEach(plant -> hashmapWithFruitsAngVeggies.put(plant.getName(), plant));

        hashmapWithFruitsAngVeggies.forEach((key, value) -> System.out.println(key + " " + value.getClass().getSimpleName()));

        Basket<Fruit> fruitBasket = new Basket<>();
        Basket<Vegetable> vegetableBasket = new Basket<>();

        fruitBasket.addItem(apple);
        fruitBasket.addItem(banana);
        vegetableBasket.addItem(tomato);
        vegetableBasket.addItem(cucumber);

        Main mc = new Main();

        mc.makeSalad(fruitBasket);
        mc.makeSalad(vegetableBasket);

        //Task1
        List<Fruit> multiFruit = new ArrayList<>();
        plants.stream()
                .filter(m -> m instanceof Fruit)
                .forEach(s -> multiFruit.add((Fruit) s));
        multiFruit.forEach(fruit -> System.out.println(fruit.getName()));

        //Task2
        Basket<Vegetable> hashmapWithVeggies = new Basket<>();
        Cucumber cucumber2 = new Cucumber();
        Tomato tomato2 = new Tomato();

        hashmapWithVeggies.addItem(cucumber2);
        hashmapWithVeggies.addItem(cucumber2);
        hashmapWithVeggies.addItem(cucumber2);

        hashmapWithVeggies.addItem(tomato2);
        hashmapWithVeggies.addItem(tomato2);

        System.out.println(hashmapWithVeggies.size());//4

    }

    public <T extends Plant> void makeSalad(Basket<T> basket) {
        Iterator<T> iterator = basket.getIterator();
        System.out.print("Готовим " + "салатик: \nРежем: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getName() + " ");
        }
        System.out.println("\nУгощайся!");
    }
}
