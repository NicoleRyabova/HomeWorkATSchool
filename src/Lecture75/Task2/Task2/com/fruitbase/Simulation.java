package Lecture75.Task2.Task2.com.fruitbase;

import Lecture75.Task2.Task2.com.fruitbase.customers.Customer;
import Lecture75.Task2.Task2.com.fruitbase.customers.FreshCustomer;
import Lecture75.Task2.Task2.com.fruitbase.customers.UniqueCustomer;

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
