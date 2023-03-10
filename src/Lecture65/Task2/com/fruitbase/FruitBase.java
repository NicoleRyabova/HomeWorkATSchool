package Lecture65.Task2.com.fruitbase;

import Lecture65.Task2.com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

//Напишите программу, иллюстрирующую деятельность воображаемой фруктовой базы,
//которая по запросам от клиентов предоставляет различные фрукты.
//В программе фруктовая база реализуется через класс FruitBase.
//Роль запросов у нас будут играть аргументы командной строки. Каждый аргумент является словом в запросе.
//Если среди этих слов будут встречаться названия известных фруктов, то будет формироваться груз,
//содержащий указанные фрукты.
//Если передан "пустой запрос" (не переданы аргументы), то программа завершается.
//
//По итогу выполнения выводится информация о собранном грузе - общий вес и цена.
//Значения цены и веса каждого фрукта на ваше усмотрение.
//
//Пример запроса: Orange Orange Blueberry Grape Pineapple
//На этот запрос должна вернуться информация о грузе, содержащем два Orange и один Pineapple.
//
//Все классы должны быть инкапсулированы, а геттеры и сеттеры соблюдать конвенцию именования методов.
//Здесь описаны только обязательные методы. Если для реализации нужны или удобны вспомогательные методы, то их можно реализовать как внутренние методы соответствующего класса.
//Например, в классе Cargo можно добавить внутренний вспомогательный метод для добавления записи в массив.
//
//При написании программы надо реализовать:
//- класс FruitBase
//    находится в пакете com.fruitbase
//    содержит поле FruitCatalogue
//    содержит конструктор без параметров
//        в нем инициализируется поле FruitCatalogue
//    содержит общедоступный метод для обработки заказа takeOrder
//        в этом методе происходит поиск слов из заказа в FruitCatalogue
//        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
//        Если среди запроса не встретились известные названия,
//        то возвращается груз Cargo с нулевым количеством фруктов
//    содержит метод main
//        здесь происходит выполнение программы согласно описанию выше
//        основные шаги:
//            создается фруктовая база
//            проверяется наличие заказа от пользователя
//            если есть заказ, то он передается в метод takeOrder
//            выводим результат
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

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        String line = "";

        if (args.length == 0) {
            System.exit(0);
        }
        for (int i = 0; i <= args.length - 1; i++) {
            line = line + args[i] + " ";
        }

        System.out.println(fruitBase.takeOrder(line));

    }
}
