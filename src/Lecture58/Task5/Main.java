package Lecture58.Task5;

import java.util.*;

//Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов в диапазоне -9 до 9.
//Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
//Выведите массив на экран в порядке убывания сумм элементов строк.
public class Main {
    public static void main(String[] args) {
        createJaggedArray();
    }

    private static void createJaggedArray() {
        int[][] jaggedArray = new int[generateAmountOfRows()][];
        Integer[] sortedArray = new Integer[jaggedArray.length];
        int sumRow;

        for (int k = 0; k < jaggedArray.length; k++) {
            jaggedArray[k] = new int[generateAmountOfColumns()];
        }

        //прогоняем n раз зубчатый массив
        for (int i = 0; i < jaggedArray.length; i++) {
            //прогоняем каждый массив внутри зубчатого массива
            sumRow = 0;

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = generateNumbersForArray();
                sumRow = sumRow + jaggedArray[i][j];
            }
            sortedArray[i] = sumRow;
            System.out.println("Массив номер " + (i + 1) + ": " + Arrays.toString(jaggedArray[i]));

        }
        Arrays.sort(sortedArray, Collections.reverseOrder());
        System.out.println("Сумма элементов строк в порядке убывания: " + Arrays.toString(sortedArray));

    }

    private static int generateNumbersForArray() {
        Random random = new Random();
        return -9 + random.nextInt(18) + 1;
    }

    private static int generateAmountOfColumns() {
        Random random = new Random();
        return 1 + random.nextInt(7);
    }

    private static int generateAmountOfRows() {
        Random random = new Random();
        return 1 + random.nextInt(5);
    }
}
