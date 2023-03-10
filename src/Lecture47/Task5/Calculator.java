package Lecture47.Task5;

//Реализуйте класс Calculator со статическими методами:
//- int add(int x, int y) - выполнение x + y
//- int sub(int x, int y) - выполнение x - y
//- int mult(int x, int y) - выполнение x * y
//- int divide(int x, int y) - выполнение x / y.
//  Имеет проверку y == 0 или нет.
//  Если равно, то пишется сообщение, что операция не может быть выполнена,
//  и программа завершается, используя System.exit(0);
//
//
//Используя класс Calculator, напишите программу, которая будет
//получать через аргументы командной строки два целых числа,
//знак операции и после этого выводить результат операции.
//через аргументы командной строки.
//
//Пример ввода аргументов:
// 10 + 12
// 10 - 12
// 10 * 12
// 10 / 0
//
//
//Проверку на наличие аргументов делать не надо.
//Для проверки знака операции используйте оператор switch.
//Если введена неподдерживаемая операция,
//то выводить список поддерживаемых операций и завершать программу.
public class Calculator {

    public static int add(int x, int y) {
        ifZero(y);
        return x + y;
    }

    public static int sub(int x, int y) {
        ifZero(y);
        return x - y;
    }

    public static int mult(int x, int y) {
        ifZero(y);
        return x * y;
    }

    public static int divide(int x, int y) {
        ifZero(y);
        return x / y;
    }

    private static void ifZero(int y) {
        if (y == 0) {
            System.out.println("Operation cannot be performed");
            System.exit(0);
        }
    }
}
