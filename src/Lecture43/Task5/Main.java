package Lecture43.Task5;

//Товар стоит a руб. b коп. За него заплатили c руб. d коп.
//
//Напишите программу, расчитывающую сдачу.
//Целые числа a, b, c, d передаются через аргументы командной строки.
//
//Проверку на наличие аргументов делать не надо.
//Нужно добавить проверку, что числа больше или равны нулю.
//В противном случае нужно вывести пользователю сообщение об ошибке,
//и завершить программу.
//Так же нужно проверить, что уплаченной суммы хватает для оплаты товара.
//В противном случае нужно вывести соответствующее сообщение и завершить программу.
//
//Формат вывода:
//Сдача составит e рублей и f копеек.
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        double bCents = (double) b / 100;// Копейки
        double dCents = (double) d / 100;// Копейки

        double sumOfAAndB = a + bCents; //Сумма рублей и копеек
        double sumOfCAndD = c + dCents;//Сумма рублей и копеек

        double restOfMoney = (sumOfCAndD - sumOfAAndB); // сумма к оплате должна быть меньше или равна тому что клиент дает в качестве оплаты

        if (a >= 0 && b >= 0 && c >= 0 && d >= 0) {
            if (restOfMoney > 0) {
                int restRubles = (int) restOfMoney;
                double restKopecks = ((restOfMoney - restRubles) * 100);

                System.out.println("Your change will be " + restRubles + " rubles and " + String.format("%1$,.0f", restKopecks) + " kopecks");
            } else if (restOfMoney == 0) {
                System.out.println("You do not need change! Have a good day"); // Вообще это условие не указано в задании, но мне показалось, так будет коректнее вывод
            } else {
                System.out.println("Error! You gave not enough money :(((");
            }
        } else {
            System.out.println("Error");
        }
    }
}