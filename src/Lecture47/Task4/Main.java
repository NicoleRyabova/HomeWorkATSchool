package Lecture47.Task4;

import java.util.Random;

//В основном классе программы объявлена и инициализиована целочисленная переменная n.
//Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
//Реализуйте метод int nextInt(int x),
//
//который возвращает случайно сгенерированное целое число от 0 до x, x не включая.
//
//Используя эти методы, напишите программу, которая генерит целые
//числа в диапазоне от 1 до n (не включая n) до тех пор, пока не сгенерит простое число.
//Для генерации простых чисел можно пользоваться классом
//java.lang.Math или java.util.Random.
public class Main {
    //static int n = 45;

    public static int nextInt(int x) {
        Random random = new Random();
        return random.nextInt(x) + 1;
    }

    static boolean isPrime(int b) {

        if (b == 1 || b == 0) {
            return false;
        }

        //Run a loop from 2 to n-1
        for (int i = 2; i <= b; i++) {
            for (int j = 2; j <= Math.sqrt(b); j++) {
                if (b % j == 0) {
                    return false;
                }
            }
        }
        System.out.println(b + " Prime");
        return true;
    }

    public static void main(String[] args) {
        int n = 45;
        while (!(isPrime(nextInt(n)))) {

        }
    }
}