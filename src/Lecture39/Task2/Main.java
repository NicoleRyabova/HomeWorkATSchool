package Lecture39.Task2;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        double x = 6.0;
        double y = 7.0;
        double z = 8.0;

        Summa summa = new Summa();
        System.out.println("Task 2: " + '\n');
        System.out.println("Sum of two int variables: " + summa.sum(a, b));
        System.out.println("Sum of three int variables: " + summa.sum(a, b, a));
        System.out.println("Sum of two double variables: " + summa.sum(x, y));
        System.out.println("Sum of three double variables: " + summa.sum(x, y, z));
        System.out.println("Sum of one int and two double variables: " + summa.sum(a, x, y));
        System.out.println("Sum of two Integer variables: " + summa.sum(Integer.valueOf(a), Integer.valueOf(b)));
    }
}
