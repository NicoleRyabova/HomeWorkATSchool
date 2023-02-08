package Lecture47.Task6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Реализуйте класс Timer, который содержит:
//- целочисленное поле seconds - общее число секунд, устанавливается в конструкторе
//- статический метод void waitSecond() - метод реализует паузу
//одной секунды. Реализовать с помощью цикла.
//- метод printTime вывода оставшегося времени в минутах и секундах.
//- объектный метод start() - запускает обратный отсчет
//и каждую секунды выводит оставшееся количество секунд.
//
//
//
//Напишите программу-таймер обратного отсчета в минутах и секундах,
//
//используя созданные класс Timer.
//Через аргументы командной строки передается число секунд.
//
//
//Проверку на наличие аргумента делать не надо.
//Нужно проверить, что введенное число больше или равно нуля.
//В противном случае выведите сообщение об ошибке
//и завершите программу.
//
//
//Например, для 61 секунды формат вывода:
//01:01
//01:00
//00:59
//...
//00:01
//00:00
public class Timer {
    int seconds;

    Timer(int seconds) {
        if(seconds <= 0){
            throw new IllegalArgumentException("Bad number");
        }
        this.seconds = seconds;

    }

    static void waitSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    private void start() throws InterruptedException {
        while (seconds>= 0){
            System.out.println(new SimpleDateFormat("mm:ss").format(new Date(TimeUnit.SECONDS.toMillis(seconds))));
            seconds--;
            waitSecond();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(-1);
        timer.start();
    }
}
