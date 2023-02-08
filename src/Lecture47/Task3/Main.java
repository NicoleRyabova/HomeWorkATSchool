package Lecture47.Task3;

import java.util.ArrayList;
import java.util.Collection;
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
    public static void snakePrint(int n, int col) {
        int value = 1;
        int iteration = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i += col) {
            iteration += 1;

            for (int j = 1; j <= col; j++) {
                if (!(value > n)) {
                    list.add(value);
                }
                value++;
                if (j == col) {
                    if (iteration % 2 == 0) {
                        Collections.reverse(list);
                        System.out.println(list);
                    } else {
                        System.out.println(list);
                    }
                    list.clear();
                }
            }
        }
    }



    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);

        snakePrint(n, col);
    }
}
