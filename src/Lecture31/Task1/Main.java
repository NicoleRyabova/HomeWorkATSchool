package Lecture31.Task1;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
