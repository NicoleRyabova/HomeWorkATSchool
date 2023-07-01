package Lecture54.Task1;

//В классе объявлена статическая переменная строкого типа со значением (кавычки не включены):
//«Циклом называется многократное выполнение одних и тех же действий.»
//
//Используя только методы класса String (без циклов, условий), напишите программу,
//которая печатает количество букв (без пробелов и точки) в переменной до определенного символа (не включая его).
//Значение символа передается через аргумент командной строки.
//
//Пример:
//Через аргументы передается "Ц", Вывод: 0.
//Через аргументы передается "а", Вывод: 7.
//Через аргументы передается ".", Вывод: 57.
public class Main {
    public static String text = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        System.out.println(resultNumber(args));
    }
    public static int resultNumber(String[] args){
        //Получаем элемент через аргумент командной строки
        String argument = String.valueOf(args[0]);

        String textWithoutSpaces = text.replaceAll(" ", "");
        return textWithoutSpaces.indexOf(argument);
    }

}