package Lecture47.Task2;

//В бригаде, работающей на уборке сена, имеется n сенокосилок.
//
//Первая сенокосилка работала m _часов_, а каждая следующая
//на 10 _минут_ больше, чем предыдущая.
//
//Напишите программу, вычисляющую количество сколько часов
//проработала вся бригада.
//
//Результат вычислений выведите на экран в часах и минутах.
//
//Например, "Бригада работало 0 часов 30 минут".
//
//Значения n и m программа получает через аргументы командной строки.
//Проверку на наличие аргументов делать не надо.
//Сделайте проверку, что n и m больше нуля. В противном случае
//выведите сообщение об ошибке и завершите программу.
public class Main {
    public static void main(String[] args) {
        int amountOfMower = Integer.parseInt(args[0]);
        int amountOfHoursOfWorkOfTheFistMower = Integer.parseInt(args[1]);

        int convertToMinutes = amountOfHoursOfWorkOfTheFistMower * 60;
        int sumOfMinutesEachMowerWorked = convertToMinutes;
        int hours;
        int summaryOfMinutesAllMowersWorked = convertToMinutes;

        if(!(amountOfMower > 0 && amountOfHoursOfWorkOfTheFistMower > 0)){
            throw new IllegalArgumentException("One of the arguments should be > 0");
        }
        for (int i = 2; i <= amountOfMower; i++) {
            sumOfMinutesEachMowerWorked += 10;
            summaryOfMinutesAllMowersWorked += sumOfMinutesEachMowerWorked;
        }
        hours = summaryOfMinutesAllMowersWorked / 60;
        int minutesLeft = summaryOfMinutesAllMowersWorked - (hours * 60);

        System.out.println("Brigades worked for " + hours + " hours " + minutesLeft + " minutes");

    }
}
