package Lecture47.Task5;

import static Lecture47.Task5.Calculator.add;
import static Lecture47.Task5.Calculator.sub;
import static Lecture47.Task5.Calculator.mult;
import static Lecture47.Task5.Calculator.divide;

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
public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String operator = String.valueOf(args[1]);
        int y = Integer.parseInt(args[2]);


        switch (operator) {
            case "+":
                System.out.println(x + " + " + y + " = " + add(x, y));
                break;
            case "-":
                System.out.println(x + " - " + y + " = " + sub(x, y));
                break;
            case "*":
                System.out.println(x + " * " + y + " = " + mult(x, y));
                break;
            case "/":
                System.out.println(x + " / " + y + " = " + divide(x, y));
                break;
            default:
                System.out.println("This operation cannot be performed. Here is a list of available operators: ");
                System.out.println("+, - , * , /");
        }

    }
}
