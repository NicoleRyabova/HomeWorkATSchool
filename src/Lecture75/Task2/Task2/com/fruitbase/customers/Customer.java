package Lecture75.Task2.Task2.com.fruitbase.customers;
//Надо создать новый пакет customers и в нем создать новые классы
//- абстрактный класс Customer
//    имеет внутренний массив покупок фруктов purchases
//    имеет внутреннее поле name - имя покупателя
//    имеет конструктор
//        инициализируется внутренний массив
//        устанавливается имя
//    имеет метод chooseFruit, который должны реализовать наследникик
//        метод принимает груз и сохраняет из него фрукты во внутренний массив, т.е. в грузе объекты заканчиваются.
//    имеет метод printPurchases
//        метод выводит полученные фрукты
//Для этого класса мы создадим две реализации:
//- FreshCustomer
//    реалиация метода chooseFruit
//        выбираются только свежие фрукты
//- UniqueCustomer
//    реалиация метода chooseFruit
//        отбирает только уникальные фрукты, т.е. те, которых еще нет во внутреннем массиве

import Lecture75.Task2.Task2.com.fruitbase.Cargo;
import Lecture75.Task2.Task2.com.fruitbase.fruits.Fruit;

import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Customer {
    protected Fruit[] purchases;
    private String name;

    public Customer(String name) {
        purchases = new Fruit[]{};
        this.name = name;
    }

    public abstract void chooseFruit(Cargo cargo);

    public void printPurchases() {
        for (Fruit fruit : purchases) {
            System.out.println(fruit.getName());
        }
    }
    protected Fruit[] mergeArrays(Fruit[] fruit) {
        return Stream.concat(Arrays.stream(purchases), Arrays.stream(fruit))
                .toArray(Fruit[]::new);
    }
}
