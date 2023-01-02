package Lecture19.Task2.ru.pflb.vehicles;

public class SportCar extends Car {
    int maxVelocity;
    VehicleClass vehicleClass = VehicleClass.SPORTS_CAR;

    //Создаю конструктор, в который будут передаваться значения переменных из main + использую ключевое слово супер,
    // т.к в родительском классе Car есть  конструктор, нужно использовать уже сущетсвующие переменные
    public SportCar(int maxVelocity, String model, double weight, String driver, String engine) {
        super(model, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    //Переопределяю toString метод + добавляю вывод переменной maxVelocity
    @Override
    public String toString() {
        return "SportCar " + '\n' +
                "maxVelocity = " + maxVelocity + '\n' +
                "model = " + model + '\n' +
                "vehicleClass = " + vehicleClass + '\n' +
                "weight = " + weight + '\n' +
                "driver = " + driver + '\n' +
                "engine = " + engine;
    }
}
