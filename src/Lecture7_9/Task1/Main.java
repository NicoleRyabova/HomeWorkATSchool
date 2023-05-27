package Lecture7_9.Task1;

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

//Создать ArrayList, который принимает только фрукты, назвать multifruit.
// Заполнить multifruit только фруктами из plants, используя streamAPI.
// Один только stream, никаких циклов, вторых stream открывать не надо.
//
//Вывести на экран названия фруктов.

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
