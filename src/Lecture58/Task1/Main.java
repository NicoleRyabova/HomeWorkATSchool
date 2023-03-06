package Lecture58.Task1;

import java.util.Arrays;
import java.util.Random;

//Реализуйте метод void fillArray(int[] a),
//который устанавливает элементам целочисленного массива а случайные целые числа -9 до 9.
//
//Напишите программу, которая создает массив из 20 целочисленных элементов,
//заполняет его случайными значениями, используя метод fillArray,
//и печатает его элементы в одну строку, разделив пробелами.
public class Main {
   public static void fillArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = -9 + random.nextInt(18) + 1;
        }
        System.out.println(replaces(Arrays.toString(a)));

    }

     static String replaces(String strings) {
        return Arrays.toString(new String[]{strings}).replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }

    public static void main(String[] args) {
        int[] a = new int[20];

        fillArray(a);
    }
}
