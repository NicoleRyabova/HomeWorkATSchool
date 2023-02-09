package Lecture43.Task3;

//Через аргументы командной строки передается число - года (целое, положительное, не превышает 30000).
//Напишите программу вычисляющую является ли данный год високосным.
//Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.
//Требуется вывести слово YES, если год является високосным и NO - в противном случае.
//Проверку на наличие аргументов делать не надо.
//Надо проверить, что переданное число находится в заданном диапазоне.
//В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.
public class Main {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if (year <= 30000 && year >= 0) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Error");
        }
    }
}