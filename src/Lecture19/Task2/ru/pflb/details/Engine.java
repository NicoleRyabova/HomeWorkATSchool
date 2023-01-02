package Lecture19.Task2.ru.pflb.details;

public class Engine {
    //Создала класс двигателя, правда не совсем поняла как его использовать, так же как и классы Driver, Person...
    double power;
    public String vendor;

    //Создаю конструктор, в который будут передаваться значения переменных из main
    public Engine(String vendor, int power) {
        this.vendor = vendor;
        this.power = power;
    }

    //Вывожу информацию о вендоре двигателя и его мощности
    @Override
    public String toString() {
        return "vendor - " + vendor + "\n" + "power = " + power;
    }
}
