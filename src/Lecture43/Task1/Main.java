package Lecture43.Task1;
//В программу через аргументы командной строки передаются три целых числа: a, b, c.
// Выведите наибольшее из данных чисел, (программа должна вывести ровно одно целое число).
//Проверку на наличие аргументов делать не надо.

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int[] array = {a, b, c};

        int maximumNumber = array[0];

        for (int i = 0; i <= array.length - 1; i++) {
            if (Integer.parseInt(args[i]) > maximumNumber) {
                maximumNumber = Integer.parseInt(args[i]);
            }

        }
        System.out.println("Maximum number is: " + maximumNumber);

    }
}
