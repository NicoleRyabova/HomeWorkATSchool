package Lecture19.Task2.ru.pflb;

import Lecture19.Task2.ru.pflb.details.Engine;
import Lecture19.Task2.ru.pflb.professions.Driver;
import Lecture19.Task2.ru.pflb.vehicles.Car;
import Lecture19.Task2.ru.pflb.vehicles.Lorry;
import Lecture19.Task2.ru.pflb.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        //Создаю объекты машин
        Lorry lorry = new Lorry(500, "Lorry model", 550, "Bob", "Engine1");
        SportCar sportCar = new SportCar(350, "Mustang", 550, "Bob", "Engine2");
        Car car = new Car("MPV", 400, "Alexey", "Engine3");

        //Объекты Driver,Engine
        Driver driver = new Driver("Bob", 31, 11, 7766777);
        Engine engine = new Engine("Engine vendor", 44);

        //Вызов всех объектов
        System.out.println(lorry + String.format("%n"));
        System.out.println(sportCar + String.format("%n"));
        System.out.println(car + String.format("%n"));

        System.out.println(driver + String.format("%n"));
        System.out.println(engine + String.format("%n"));

        //Вызываю методы класса Car
        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();
    }
}
