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
        System.out.println(deleteAllSymbolsButDigits(text));
    }

    public static StringBuilder deleteAllSymbolsButDigits(StringBuilder text) {
        for (int i = 0; i < text.length(); ) {
            char symbol = text.charAt(i);
            if (!Character.isDigit(symbol)) {
                text.delete(i, i + 1);
            } else {
                i++;
            }
        }
        return text;
    }
}
