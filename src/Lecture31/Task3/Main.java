package Lecture31.Task3;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean result = a % b == 0;

        System.out.println("Given: " + "a = " + a + ", b = " + b);
        System.out.println(result);
    }
}