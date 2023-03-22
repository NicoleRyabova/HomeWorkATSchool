package Lecture75.Task2.Task2.com.fruitbase;

import Lecture75.Task2.Task2.com.fruitbase.customers.Customer;
import Lecture75.Task2.Task2.com.fruitbase.customers.FreshCustomer;
import Lecture75.Task2.Task2.com.fruitbase.customers.UniqueCustomer;

//Также добавим специальный класс Simulation, внутри которого теперь будет выполняться программа.
//Для этого в него перенесем метод main из Fruitbase и внесем изменения:
//- после создания объекта FruitBase создается массив покупателей, в который будут входит экземпляры обоих видов покупателей
//- далее для каждого покупателя:
//    выполняется заказ и формируется груз, выводится информации о грузе
//    покупателя выбирает из груза интересующие его фрукты
//    покупатель выводит полученные фрукты
public class Simulation {

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        Customer[] customers = new Customer[]{new FreshCustomer("Petr"), new UniqueCustomer("Vasya")};

        String line = "";

        if (args.length == 0) {
            System.exit(0);
        }
        for (int i = 0; i <= args.length - 1; i++) {
            line = line + args[i] + " ";
        }

        for (Customer customer : customers) {
            Cargo cargo = fruitBase.takeOrder(line);
            System.out.println(cargo);
            customer.chooseFruit(cargo);
            customer.printPurchases();
        }
    }
}
