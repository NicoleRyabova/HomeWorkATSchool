package Lecture7_6.Task3;

import Lecture7_6.Task3.Fruits.Apple;
import Lecture7_6.Task3.Fruits.Banana;
import Lecture7_6.Task3.Fruits.Fruit;
import Lecture7_6.Task3.Vegetables.Cucumber;
import Lecture7_6.Task3.Vegetables.Tomato;
import Lecture7_6.Task3.Vegetables.Vegetable;

import java.util.*;

//Создать ArrayList plants и заполнить его экземплярами фруктов и овощей всех видов по 1 штуке каждого (!в 1 ArrayList).
//Создать HashMap и заполнить его фруктами и овощами с помощью forEach,
// в ключ записывая название фрукта/овоща, а в значение - само растение.
//Вывести на экран название растения из карты и рядом с ним имя класса через пробел.
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
