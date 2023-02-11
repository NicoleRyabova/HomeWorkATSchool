package Lecture54.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Через аругмент командной строки передается строка - путь до некоторого файла -
//содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".
//
//Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
//Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
//то выдать ошибку: "Введен некорректный путь до файла."
//
//Пример:
//1) Через аргументы передается "/bin/java", выводится:
//Путь: /bin/
//Имя файла: java
//
//2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
//Путь: C:\Program Files\Java\bin\
//Имя файла: java
//
//3) Через аргументы передается "/", выводится:
//Введен некорректный путь до файла.
//Проверку на наличие и корректность аргумента делать не надо.
public class Main {
    public static void main(String[] args) {
        String filePath = String.valueOf(args[0]);
        char a = '/';
        char b = '\\';
        List<String> fileName = new ArrayList<>();
        List<String> pathToFile = new ArrayList<>();

        // Переводим "\" в "/", т.к у меня последний "\ " не печатается, вместо слэша выводит кавычку :(, поэтому пока так
        String textWithoutSlashes = filePath.replaceAll("\\\\", "/");

        for (int i = textWithoutSlashes.length(); i >= textWithoutSlashes.indexOf(1); i--) {
            //Проверяем последний элемент строки, если он равняется слэшу, то выводим ошибку
            if (i == textWithoutSlashes.length()) {
                if ((textWithoutSlashes.charAt(i - 1)) == a || textWithoutSlashes.charAt(i - 1) == b) {
                    throw new IllegalArgumentException("Non correct path to file");
                } else {
                    //Делаем цикл до тех пор, пока не обнаружим слэш
                    for (int j = textWithoutSlashes.length(); (textWithoutSlashes.charAt(j - 1)) != a || (textWithoutSlashes.charAt(j - 1) != b); j--) {

                        //Добавляем символ, пока не дойдем до слеша
                        fileName.add(String.valueOf(textWithoutSlashes.charAt(j - 1)));
                        //Если находим слэш
                        if ((textWithoutSlashes.charAt(j - 1)) == a || (textWithoutSlashes.charAt(j - 1) == b)) {
                            //То реверсируем лист
                            Collections.reverse(fileName);
                            // И удаляем 0 элемент, т.е. слэш
                            fileName.remove(0);

                            //Оставшие символы после имени файла заносим в лист для пути к файлу
                            for (int e = 0; e <= (textWithoutSlashes.length() - fileName.size() - 1); e++) {
                                pathToFile.add(String.valueOf(textWithoutSlashes.charAt(e)));
                            }
                            System.out.println("Путь: " + replaces(pathToFile));
                            System.out.println("Имя файла: " + replaces(fileName));
                            break;
                        }

                    }
                }
            }

        }
    }

    private static String replaces(List<String> strings) {
        return strings.toString().replace("[", "")
                .replace("]", "")
                .replace(", ", "");
    }
}