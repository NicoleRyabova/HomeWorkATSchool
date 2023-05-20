package Lecture7_6.Task2;

import Lecture7_6.Task2.Fruits.Apple;
import Lecture7_6.Task2.Fruits.Banana;
import Lecture7_6.Task2.Fruits.Fruit;
import Lecture7_6.Task2.Vegetables.Cucumber;
import Lecture7_6.Task2.Vegetables.Tomato;
import Lecture7_6.Task2.Vegetables.Vegetable;

import java.util.Iterator;

//Создать интерфейс Plant и унаследоваться от него фруктами и овощами (интерфейсами).
//
//// В методе Plant создать метод getName(), который будет возвращать строку.
//
//// Реализовать для классов возврат имени фрукта ("Апельсин", "Огурец" и т.д.)
//
////Вместо массива теперь в классе с корзиной поставить HashMap,
//// в методе addItem добавлять новые элементы в ключ, подумать,
//// как можно "заглушить" значение value HashMap, так как вам оно точно не понадобится.
//
//// Реализовать метод iterator внутри класса корзин,
//// чтобы он возвращал итерратор множества ключей глобального поля HashMap.
////
////Реализовать метод makeSalad, в классе, где добавляли фрукты и овощи в корзине,
//// в который можно кидать корзину.
//// Результатом работы этого метода должен был вывод в консоль строк (в методе вывод должен быть с помощью итератора,
//// который реализовали в этом задании):
////```
////Готовим салатик:
////Режем - тут должно быть столько же фруктов, сколько было элементов в корзине
////
////Угощайся!
////```
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        Vegetable tomato = new Tomato();
        Vegetable cucumber = new Cucumber();

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
