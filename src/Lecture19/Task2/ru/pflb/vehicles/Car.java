package Lecture19.Task2.ru.pflb.vehicles;

import Lecture19.Task2.ru.pflb.Person;
import Lecture19.Task2.ru.pflb.details.Engine;
import Lecture19.Task2.ru.pflb.professions.Driver;

public class Car {
    //Создаю переменные, только VehicleClass задаю значение, которое не будет устанавливаться в main
    String model;
    VehicleClass vehicleClass = VehicleClass.LARGE;
    double weight;
    String driver;
    String engine;

    //Создаю обычный конструктор, в который будут передаваться значения переменных из main
    public Car(String model, double weight, String driver, String engine){
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    //Создаю методы
    public void start(){
        System.out.println("Let's go!");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }

    //Создаю toString метод для вывода информации о машине
    @Override
    public String toString() {
        return "Car " + '\n' +
                "model = " + model + '\n' +
                "vehicleClass = " + vehicleClass + '\n'+
                "weight = " + weight + '\n'+
                "driver = " + driver + '\n' +
                "engine = " + engine;
    }
}
