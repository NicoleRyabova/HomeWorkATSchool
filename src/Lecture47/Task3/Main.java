package Lecture47.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Напишите метод snakePrint(int n, int col),
//который выводит числа "змейкой" от 1 до n:
//    1 2 3 4
//    8 7 6 5
//    9 10 11 12
//    ... n
//где:
//n - максимальное число
//col - количество цифр в одной строке
//Выводимые числа разделены пробелами.
//
//Используя реализованный метод, напишите программу, которая через
//аргументы командной строки получает целочисленные значения n и col,
//а затем печатает соответствующего размера змейку.
//
//Проверку на наличие аргументов делать не надо.
//Сделайте проверку, что n больше или равно 1, а m больше 0.
//В противном случае выведите сообщение об ошибке
//и завершите программу.
public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);

        method(n, col);
    }

    static void method(int n, int col) {

        if (!(n >= 1) || !(col > 0)) {
            throw new IllegalArgumentException("custom exception");
        }

        List<String> snakeList = new ArrayList<>();
        int value = 1;
        int iteration = 0;
        for (int i = 1; i <= n; i += col) {

            iteration += 1;
            for (int j = 1; j <= col; j++) {

                if (!(value > n)) {
                    snakeList.add(String.valueOf(value));
                }

                if (j == col) {

                    if (iteration % 2 == 0) {
                        Collections.reverse(snakeList);

                        if (snakeList.size() != col) {

                            List<String> anotherList = new ArrayList<>();

                            for (int e = 1; e <= col - snakeList.size(); e++) {
                                anotherList.add(getPlaceholder(value));
                            }

                            anotherList.addAll(snakeList);

                            System.out.println(replaces(anotherList));
                        } else {
                            System.out.println(replaces(snakeList));
                        }
                    } else {
                        System.out.println(replaces(snakeList));
                    }
                    snakeList.clear();
                }
                value++;
            }
        }
    }

    private static String replaces(List<String> strings) {
        return strings.toString().replace("[", "")
                .replace("]", "")
                .replace(",", " ");
    }

    private static String getPlaceholder(Integer value) {
        return " ".repeat(String.valueOf(value).toCharArray().length);
    }
}
