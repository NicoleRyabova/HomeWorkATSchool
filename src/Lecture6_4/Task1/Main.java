package Lecture6_4.Task1;

import Lecture4_4.Task1.Double;
import Lecture4_4.Task1.Exact;
import Lecture4_4.Task1.Function;
import Lecture4_4.Task1.Half;
import Lecture4_4.Task1.Square;

import java.util.Arrays;
import java.util.stream.Stream;

//Напишите в отдельном классе программу, которая через аргументы командной
//строки
//получает последовательность целых чисел и название операции, которую надо
//применить числам.
//При выполнении печатается исходная последовательность чисел, а потом
//печатается последовательность,
//полученная применением операции к числам.
//Название операции передается первым аргументом, а далее передаются числа.
//Название операции соответствует названиям классов Half, Double, Exact, Square.
//Для реализации программы создайте метод applyFunction, который на вход
//получает два аргумента:
//- массив из переданных чисел
//- объект типа Function.
//Этот метод возвращает новый массив, где каждый элемент является результатом
//применения
//метода evaluate объекта типа Function к соответствующему элементу исходного
//массива.
//При обработке аргументов командной строки добавьте следующие проверки:
//- Если не передано название операции, то программа завершается с
//соответствующим сообщением об ошибке.
//- Если передано неподдерживаемое название класса, то программа завершается с
//соответствующим сообщением.
//- Если не передано хотя бы одно число, то программа завершается, с
//соответствующим сообщением об ошибке.
//Пример:
//1) Переданные аргументы:
// Вывод: Не передано название операции.
//2) Переданные аргументы: Exact
// Вывод: Не переданы числа для операции.
//3) Переданные аргументы Triple
// Вывод: Операция Triple не поддерживается.
//4) Переданные аргументы: Half 1 2 4 8
// Вывод:
// 1 2 4 8
// 0 1 2 4

//Добавьте в первое задание 4.4 обработку новых операций:
//- используя анонимный класс, добавьте операцию Wave: к каждому числу прибавляется значение предыдущего.
//  К первому элементу прибавляется 0.
//  Пример:
//  Переданные аругменты: Wave 1 2 4 8
//  Вывод:
//  1 2 4 8
//  1 3 6 12
public class Main {
    // Объекты класов
    private static Lecture4_4.Task1.Half half = new Lecture4_4.Task1.Half();
    private static Double doubled = new Double();
    private static Exact exact = new Exact();
    private static Square square = new Square();

    public static void main(String[] args) {

            Function wave = new Function() {
            int temp = 0;

            public int evaluate(int number) {
                int res = number + temp;
                temp = number;
                return res;
            }

            @Override
            public String toString() {
                return "Wave";
            }
        };

        // Если нет аргументов, что вылетает исключение
        if (args.length == 0) {
            throw new IllegalArgumentException("Не передано название операции");
        } else {
            //Если после названия операции ничего нет, то вылетает исключение
            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Не переданы числа для операции");
            } else {
                int[] arrayFilledWithNumbersFromArgs = new int[args.length - 1]; // Создаю массив длиной как кол-во чисел в аргументах

                for (int i = 1; i < args.length; i++) {
                    arrayFilledWithNumbersFromArgs[i - 1] = Integer.parseInt(args[i]); //заполняю массив с числами из args
                }
                switch (args[0]) { // Проверяю, соответствует ли название операции нужному
                    case "Half":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs))); // печатаю первоначальный массив чисел
                        int[] arrayForHalf = applyFunction(arrayFilledWithNumbersFromArgs, half); // создаю массив, который будет соответствовать возвращаемому массиву из метода applyFunction
                        Stream.of(arrayForHalf).forEach(s -> System.out.println(replaces(Arrays.toString(s)))); // С помощью стрим апи печатаю элементы массива
                        break;
                    case "Double":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        int[] arrayForDouble = applyFunction(arrayFilledWithNumbersFromArgs, doubled);
                        Stream.of(arrayForDouble).forEach(s -> System.out.println(replaces(Arrays.toString(s))));
                        break;
                    case "Exact":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        int[] arrayForExact = applyFunction(arrayFilledWithNumbersFromArgs, exact);
                        Stream.of(arrayForExact).forEach(s -> System.out.println(replaces(Arrays.toString(s))));
                        break;
                    case "Square":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        int[] arrayForSquare = applyFunction(arrayFilledWithNumbersFromArgs, square);
                        Stream.of(arrayForSquare).forEach(s -> System.out.println(replaces(Arrays.toString(s))));
                        break;
                    case "Wave":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        int resIndex = 0;

                        for (int index = 1; index < args.length; index++) {
                            arrayFilledWithNumbersFromArgs[resIndex] = wave.evaluate(Integer.parseInt(args[index]));
                            resIndex++;
                        }

                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        break;

                    case "Squareeven":
                        System.out.println(replaces(Arrays.toString(arrayFilledWithNumbersFromArgs)));
                        wave = (int num) -> {
                            if (num % 2 == 0) {
                                return num * num;
                            }
                            return num;
                        };
                        int[] arrayWithEvenNumbers = new int[arrayFilledWithNumbersFromArgs.length];
                        for (int i = 0; i < arrayWithEvenNumbers.length; i++) {
                            arrayWithEvenNumbers[i] = wave.evaluate(arrayFilledWithNumbersFromArgs[i]);
                        }

                        System.out.println(replaces(Arrays.toString(arrayWithEvenNumbers)));
                        break;
                    default:
                        throw new IllegalArgumentException(System.out.printf("Операция %s не поддерживается ", args[0]).toString());
                }
            }
        }
    }


    private static int[] applyFunction(int[] arrayOfNumbers, Function method) {
        int[] arrayOfNewNumbers = new int[arrayOfNumbers.length]; // создает массив длинной, как первый массив

        // Если переменная соответствует какому-либо классу, который имплементирует интерфейс Function...
        if (method instanceof Half) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                arrayOfNewNumbers[i] = half.evaluate(arrayOfNumbers[i]);
            }
        } else if (method instanceof Double) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                arrayOfNewNumbers[i] = doubled.evaluate(arrayOfNumbers[i]);
            }
        } else if (method instanceof Exact) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                arrayOfNewNumbers[i] = exact.evaluate(arrayOfNumbers[i]);
            }
        } else if (method instanceof Square) {
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                arrayOfNewNumbers[i] = square.evaluate(arrayOfNumbers[i]);
            }
        }
        return arrayOfNewNumbers;
    }

    private static String replaces(String strings) {
        return Arrays.toString(new String[]{strings}).replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }
}
/*  wave = (int num) -> {
                            int[] arrayWithEvenNumbers = new int[arrayFilledWithNumbersFromArgs.length];
                            if (num % 2 == 0) {
                                arrayWithEvenNumbers[num] = num * num;
                            }
                            arrayWithEvenNumbers[num] = num;
                            return arrayWithEvenNumbers;
                        };*/