package Lecture31.Task2;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        a = a + b; // 9

        b = a - b; // 9 - 5
        a = a - b; // 9 - 4

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
