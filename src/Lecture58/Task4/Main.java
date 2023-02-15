package Lecture58.Task4;

import java.util.Arrays;

//Реализуйте метод int median(int[] a), который возвращает целочисленное значение медианы массива а.
//Для отсортированного массива четной длины медиана расчитывается как среднее арифметическое двух центральных элементов.
//Для отсортированного массива нечетной длины медиана расчитывается как центральный элемент.
//
//Например, для массива 1 2 3 4 5 медиана будет 3. Для массива 1 2 3 4 5 6 медиана будет (3 + 4)/2 = 3.5
//Для сортировки массива используйте метод Arrays.sort или метод bubbleSort из третьего задания.
//Порядок элементов в исходном массиве, который передается в метод через аргумент, не должен быть изменен.
//
//Напишите программу, которая создает массив из 20 целочисленных элементов,
//заполняет случайным образом , выводит элементы в одну строку, разделив пробелами.
//Затем, используя метод median, получите и выведите значение вычисленной медианы.
//После этого вновь напечатайте элементы исходного массива в одну строку, разделив пробелами,
//чтобы убедиться, что их порядок не изменился.
public class Main {
    int median(int[] a) {
        int[] median;
        int sum = 0;

        Arrays.sort(a);

        if ((a.length) % 2 == 0) {
            median = new int[2];

            for (int i = 0; i <= (a.length) / 2; i++) {
                if (i == (a.length) / 2) {
                    median[0] = a[i - 1];

                }
            }

            for (int i = (a.length); i >= (a.length) - ((a.length) / 2); i--) {
                if (i == (a.length) - ((a.length) / 2)) {
                    median[1] = a[i];
                }
            }

            sum = (median[0] + median[1]) / 2;
            return sum;
        }

        if ((a.length % 2 != 0)) {
            median = new int[1];

            for (int i = 0; i <= (a.length) / 2; i++) {
                if (i == (a.length) / 2) {
                    median[0] = a[i];

                }
            }

            sum = median[0];
            return sum;
        }

        return sum;
    }

    private static String replaces(String strings) {
        return strings.replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 20, 1, 19, 13, 3, 7, 5, 8, 14, 6, 18, 17, 12, 9, 11, 10, 15, 16};
        int[] backup = Arrays.copyOf(array, array.length); //2, 4, 1, 19, 13, 3, 7, 5, 8, 14, 6, 18, 17, 12, 9, 11, 10, 15, 16

        Main main = new Main();
        System.out.println("Оригинальный массив: " + replaces(Arrays.toString(array)) + "\n");
        System.out.println("Медиана массива: " + main.median(array) + "\n");
        System.out.println("Неизмененный массив: " + replaces(Arrays.toString(backup)));
    }
}
