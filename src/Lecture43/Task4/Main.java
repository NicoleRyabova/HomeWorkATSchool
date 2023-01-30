package Lecture43.Task4;


//В программу через аргументы командной строки передаются три натуральных числа – стороны треугольника.
//
//Необходимо определить тип треугольника с данными сторонами
//(остроугольный, тупоугольный, прямоугольный)
//вывести одно из слов:
//- right для прямоугольного треугольника,
//-  для остроугольного треугольника,
//- obtuse для тупоугольного треугольника
//- или impossible, если входные числа не образуют треугольника.
//
//Стороны сторон передаются через аргументы командной строки.
//Проверку на наличие аргументов делать не надо.
public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double cosineA = (((b * b) + (c * c) - (a * a)) / (2 * b * c));
        double cosineB = (((a * a) + (c * c) - (b * b)) / (2 * a * c));
        double cosineY = (((a * a) + (b * b) - (c * c)) / (2 * a * b));

        double arcCosineA = Math.acos(cosineA);
        double arcCosineB = Math.acos(cosineB);
        double arcCosineY = Math.acos(cosineY);

        double angleAInDegrees = Math.toDegrees(arcCosineA);
        double angleBInDegrees = Math.toDegrees(arcCosineB);
        double angleYInDegrees = 180 - angleAInDegrees - angleBInDegrees;

        double sumOfAllAngles = angleAInDegrees + angleBInDegrees + angleYInDegrees;

        if (sumOfAllAngles == 180) {
            if (angleAInDegrees < 90 && angleBInDegrees < 90 && angleYInDegrees < 90) {
                System.out.println("acute");
            } else if (angleAInDegrees > 90 || angleBInDegrees > 90 || angleYInDegrees > 90) {
                System.out.println("obtuse");
            } else {
                System.out.println("right");
            }
        } else {
            System.out.println("impossible");
        }
    }
}
