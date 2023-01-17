package Lecture31.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        //Получилось выполнить задание только через if'ы, пробовала через switch, но там в кажестве case нельзя подставить boolean значение, а без него я не знаю как...

        if (Arrays.equals(args[0].toCharArray(), args[1].toCharArray())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}