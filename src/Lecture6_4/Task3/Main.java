package Lecture6_4.Task3;

import Lecture4_4.Task3.FirstQueue;
import Lecture4_4.Task3.SecondQueue;

import java.util.ArrayList;
import java.util.List;
//Создайте интерфейс Queue, описывающий требования к реализации очереди.
//Содержит следующие абстрактные методы:
//void add(int value) - добавляет целочисленное значение в очередь
//int remove() - удаляет значение из очереди
//boolean isEmpty() - возвращает true, если в очереди нет элементов
//
//Напишите две реализации очереди, удовлетворяющую этому интерфейсу.
//1) Новые элементы добавляются в конец очереди
//   Существующие элементы удаляются из начала очереди
//2) Новые элементы добавляются в начало очереди
//   Удаляется наименьший элемент
//По необходимости можно добавлять вспомогательные атрибуты классов, методы и логику,
//главное соответствие интерфейсу.
//Обе реализации должны содержать переопределенный метод toString, который возвращает строку
//с элементами очереди.
//
//Напишите программу, в которой через аргументы командной строки передаются целые числа;
//Для обоих типов очереди:
//    создается очередь, в которую добавляются эти числа.
//    Когда все значения добавлены выводится содержимое очереди.
//    Далее по одному удаляются элементы из очереди и печатается текущее содержимое очереди.
//
//
//Пример:
//1) Переданные аругменты: 1 3 2 4
//  Вывод:
//  Очередь #1:
//  Добавленные элементы: 1 3 2 4
//  Удален элемент: 1, оставшиеся элементы: 3 2 4
//  Удален элемент: 3, оставшиеся элементы: 2 4
//  Удален элемент: 2, оставшиеся элементы: 4
//  Удален элемент: 4, элементы отсутствуют
//
//  Очередь #2:
//  Добавленные элементы: 4 2 3 1
//  Удален элемент: 1, оставшиеся элементы: 4 2 3
//  Удален элемент: 2, оставшиеся элементы: 4 3
//  Удален элемент: 3, оставшиеся элементы: 4
//  Удален элемент: 4, элементы отсутствуют
//
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Не переданы элементы");
        }

        List<String> listOfNumbersFromArgs = new ArrayList<>(List.of(args)); //Создает лист, который заполняется числами из аргументов
        FirstQueue firstQueue = new FirstQueue();
        SecondQueue secondQueue = new SecondQueue();

        for(int i = 0; i < listOfNumbersFromArgs.size(); i++){
            firstQueue.add(Integer.parseInt(listOfNumbersFromArgs.get(i)));
        }
        System.out.println("Очередь №1 \nДобавленные элементы " + firstQueue.printList());

        for (int i = 0; i < listOfNumbersFromArgs.size(); i++) {
           firstQueue.remove();
            System.out.println(firstQueue);
        }
        System.out.println();

        for (int i = listOfNumbersFromArgs.size() - 1; i >= 0; i--) { //Цикл, с помощью метода add в классе SecondQueue заполняет лист listOfNumbers числами из листа listOfNumbersFromArgs в обратном порядке
            secondQueue.add(Integer.parseInt(listOfNumbersFromArgs.get(i)));
        }
        System.out.println("Очередь №2 \nДобавленные элементы " + secondQueue.printList());//SecondQueue.replaces(listOfNumbers.toString())

        for (int i = 0; i < listOfNumbersFromArgs.size(); i++) { // Цикл, с помощью метода remove в классе SecondQueue удаляет наименьший элемент листа
            secondQueue.remove();
            System.out.println(secondQueue); // Вызывается переопределенный метод toString
        }
    }
}