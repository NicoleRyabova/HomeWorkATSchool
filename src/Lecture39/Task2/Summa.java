package Lecture39.Task2;

/*Создать класс Summa, в нем cоздать и перегрузить метод sum-
возвращающий сумму int от 2х переменных int-
возвращающий сумму double от 3х переменных int-
возвращающий сумму double от 2х и от 3х переменных double-
возвращающий сумму double от 1 int и от 2х переменных double-
возвращающий double из 2х переменных типа Integer

Сделать класс с методом main, в методе объявить переменные а и b типа int
, переменные x, y, z типа double.
Вызовите созданные методы класса Summa, используя объявленные переменные. Полученные результаты вывести на экран.*/
public class Summa {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

    double sum(double a, double b, double c) {
        return a + b + c;
    }

    double sum(int a, double b, double c) {
        return a + b + c;
    }

    double sum(Integer a, Integer b) {
        return a + b;
    }
}
