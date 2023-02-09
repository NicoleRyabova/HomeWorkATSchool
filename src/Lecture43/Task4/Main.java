package Lecture43.Task4;


import java.util.Arrays;

//В программу через аргументы командной строки передаются три натуральных числа – стороны треугольника.
//
//Необходимо определить тип треугольника с данными сторонами
//(остроугольный, тупоугольный, прямоугольный)
//вывести одно из слов:
//- right для прямоугольного треугольника,
//-  для остроугольного треугольника,
//- obtuse для тупоугольного треугольника
//- или impossible, если входные числа не образуют треугольника.
//
//Стороны сторон передаются через аргументы командной строки.
//Проверку на наличие аргументов делать не надо.
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int[] array = {a, b, c};

        Arrays.sort(array);

        int maximumNumber = array[2];
        int middleNumber = array[1];
        int smallestNumber = array[0];

        int maximumNumberSquared = maximumNumber * maximumNumber;
        int smallestNumberSquared = smallestNumber * smallestNumber;
        int middleNumberSquered = middleNumber * middleNumber;

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (maximumNumberSquared == smallestNumberSquared + middleNumberSquered) {
                System.out.println("right");
            } else if (maximumNumberSquared < smallestNumberSquared + middleNumberSquered) {
                System.out.println("acute");
            } else if (maximumNumberSquared > smallestNumberSquared + middleNumberSquered) {
                System.out.println("obtuse");
            }

        } else {
            System.out.println("impossible");
        }
    }
}
