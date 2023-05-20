package Lecture7_6.Task1;

//1.Создать интерфейс Fruit без методов и реализовать его в яблоках и бананах.
//
//2.Создать интерфейс Vegetable без методов и реализовать его в огурцах и помидорах.
//
//3.Реализовать класс Basket, с методом addItem,
// который будет принимать в себя только овощи или фрукты
// и помещать это всё в глобальную переменную -
// массив (5 элементов достаточно) внутри класса.
//
//4.В отдельном классе в методе main создать по одному фрукту,
// овощу и по одной корзине для фруктов и для овощей отдельно (всего две).
// Всю клетчатку надо разложить по соответствующим корзинам,
// если получится положить огурец в корзину для фруктов,
// то стоит ещё раз пересмотреть тему с дженериками.
public class Main {
    public static void main(String[] args) {
        Fruit appleCellulose = new Apple();
        Vegetable tomatoCellulose = new Tomato();

        Basket<Fruit> fruitBasket = new Basket<>();
        Basket<Vegetable> vegetableBasket = new Basket<>();

        fruitBasket.addItem(appleCellulose);
        vegetableBasket.addItem(tomatoCellulose);
    }
}
