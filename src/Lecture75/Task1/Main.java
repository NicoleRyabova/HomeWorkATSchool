package Lecture75.Task1;

//Напишите программу, которая через аргументы командной строки получает "слова" (каждый аргумент - отдельное слово), печатает полученную последовательность слов,
// а потом выводит только уникальные слова из переданной последовательности.
//Сохранять порядок символов в итоговом выводе необязательно.
//
//Если в программу не переданы аргументы, то она завершается.
//Пример:
//1)
//Ввод: a aa abc a ab aa
//Вывод:
//a aa abc a ab aa
//a aa ab abc
//
//2)
//Ввод:
//Вывод:

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Error! You should write at least one word!");
        }

        System.out.println(replacesList(List.of(args)));
        Set<String> set = new HashSet<>(List.of(args));
        System.out.println(replaces(set));
    }

    private static String replaces(Set<String> strings) {
        return strings.toString().replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }

    private static String replacesList(List<String> strings) {
        return strings.toString().replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }
}