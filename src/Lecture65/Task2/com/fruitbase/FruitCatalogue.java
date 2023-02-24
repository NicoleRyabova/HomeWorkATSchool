package Lecture65.Task2.com.fruitbase;

import Lecture65.Task2.com.fruitbase.fruits.*;

//- класс FruitCatalogue
//    находится в пакете com.fruitbase
//    содержит поле массив Fruit - список записей известных фруктов
//    содержит конструктор без параметров
//        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
//    содержит метод findFruit, доступный только в пакете
//        по переданному слову проверяет есть ли информация о таком фрукте
//        если есть, то возвращает Fruit. Если нет, то возвращает null.
public class FruitCatalogue {
    Fruit[] fruits;

    public FruitCatalogue() {
        fruits = new Fruit[]{new Apple(), new Banana(), new Orange(), new Pineapple()};
    }

    Fruit findFruit(String fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruit.equalsIgnoreCase(fruits[i].getName())) {
                return fruits[i];
            }
        }
        return null;
    }
}
