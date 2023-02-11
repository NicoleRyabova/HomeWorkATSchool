package Lecture54.Task4;

//Через аргумент командной строки передается строка.
//Используя StringBuilder, напишите программу, которая в переданной строке удаляет из неё всё, кроме цифр.
//Выведите результирующую строку.
//
//1)
//Пример аргумента: 01a10vt0101c
//Вывод: 10011010
//
//2)
//Пример аргумента: avtc
//Вывод:
//
//Проверку на наличие и корректность аргумента делать не надо.
public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(String.valueOf(args[0]));

        text = new StringBuilder(text.toString().replaceAll("[^0-9]", ""));
        System.out.println(text);

    }
}
