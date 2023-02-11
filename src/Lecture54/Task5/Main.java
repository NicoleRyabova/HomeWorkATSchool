package Lecture54.Task5;

//Напишите метод "static boolean isInteger(String str)", который получает на вход строку и возвращает true, если строка str состоит только из цифр.
//
//С использованием этого метода напишите программу,
//которая проверяет является ли строка, переданная через аргументы командной строки, целым числом, и выводит результат проверки.
//
//Проверку на наличие аргументов делать не надо.
//Например:
//1)
//Входная строка: "1234567890"
//Вывод: Строка является целым числом
//
//2)
//Входная строка: "1,234E567890"
//Вывод: Строка не является целым числом
public class Main {
    public static void main(String[] args) {
        String text = args[0];
        System.out.println(isWholeNumber(text));
    }

    private static boolean isInteger(String str) {
        int lengthOfString = str.length();
        for (int i = 0; i < lengthOfString; i++) {

            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private static String isWholeNumber(String number) {
        if (isInteger(number)) {
            return "Строка является целым числом";
        }

        return "Строка не является целым числом";
    }
}