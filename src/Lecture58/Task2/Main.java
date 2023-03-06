package Lecture58.Task2;

import java.util.ArrayList;
import java.util.List;

//Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр. Каждый аргумент - отдельное "слово".
//Напишите программу, которая выводит слова наибольшей длины.
//
//Сделайте проверку на наличие аргументов командной строки.
//Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
//Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
//Иначе выведите сообщение об ошибке и завершите программу.
//
//Например:
//Ввод: 123 abcd b33f 0s 12
//Вывод: abcd b33f
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listOfMaxNumbers = new ArrayList<>();

        if (args.length == 0) {
            throw new IllegalArgumentException("Error! You should write at least one word!");
        }

        for (int i = 0; i < args.length; i++) {

            if (check(args[i])) {
                list.add(args[i]);

            } else {
                throw new IllegalArgumentException("Error! Word should contain only latin symbols or numbers!");

            }
        }

        String maxArgument = args[0];

        for (int j = 0; j < list.size(); j++) {

            if (args[j].length() > maxArgument.length()) {
                listOfMaxNumbers.remove(maxArgument);
                maxArgument = args[j];
                listOfMaxNumbers.add(maxArgument);
            } else if (args[j].length() == maxArgument.length()) {
                listOfMaxNumbers.add(args[j]);
            }
        }

        System.out.println(replaces(listOfMaxNumbers));
    }

    static boolean check(String s) {
        if (s == null) {
            return false;
        }

        int len = s.length();

        for (int i = 0; i <= len - 1; i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                if (Character.isLetter(s.charAt(i))) {
                    if (!(Character.isLowerCase(s.charAt(i)) && s.matches("\\w+"))) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static String replaces(List<String> strings) {
        return strings.toString().replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }
}
