package Lecture58.Task3;

//Реализуйте метод void bubbleSort(int[] a),
//который сортирует целочисленные элементы в массиве a по возрастанию (первый элемент - минимальный) согласно алгоритму пузырьковой сортировки.
//en.wikipedia.org/wiki/Bubble_sort
//
//Используя метод fillArray из первого задания и метод bubbleSort, напишите программу, которая создает массив из 20 целочисленных элементов, выводит элементы в одну строку, разделив пробелами.
//Затем, используя метод bubbleSort, сортирует созданный массив
//и выводит элементы отсортированного массива в одну строку, разделив пробелами.
public class BubbleSort {
    void bubbleSort(int[] array) {
        int temporaryVariable;
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) { // 4 1
                    temporaryVariable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryVariable;
                    isSorted = false;
                }
            }

            if (isSorted) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 19, 13, 20, 14, 3, 7, 5, 8, 14, 6, 18, 17, 12, 9, 11, 10, 15, 16};

        System.out.println("Не отсоритированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);

        System.out.println("\n \n" + "Отсоритированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
