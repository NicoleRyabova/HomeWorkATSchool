package Lecture75.Task2.Task2.com.fruitbase;

import Lecture75.Task2.Task2.com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

//
public class FruitBase {
    FruitCatalogue fruitCatalogue;

    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String order) {
        List<Fruit> rightFruits = new ArrayList<>();
        Cargo cargo = new Cargo();

        for (String nameFruit : order.split(" ")) {
            Fruit fruit = fruitCatalogue.findFruit(nameFruit);

            if (fruit != null) {
                rightFruits.add(fruit);
            }
        }
        if (!rightFruits.isEmpty()) {
            rightFruits.forEach(fruit -> cargo.addFruit(fruit));
            return cargo;
        }
        return cargo;
    }
}
