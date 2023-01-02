package Lecture19.Task2.ru.pflb.vehicles;

public class Lorry extends Car {
    public int loadingAmount;
    VehicleClass vehicleClass = VehicleClass.MEDIUM;

    //Создаю конструктор, в который будут передаваться значения переменных из main + использую ключевое слово супер,
    // т.к в родительском классе Car есть  конструктор, нужно использовать уже сущетсвующие переменные
    public Lorry(int loadingAmount, String model, double weight, String driver, String engine) {
        super(model, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }
//Переопределяю toString метод + добавляю вывод переменной loadingAmount

    @Override
    public String toString() {
        return "Lorry" + '\n' +
                "loadingAmount = " + loadingAmount + '\n' +
                "model = " + model + '\n' +
                "vehicleClass = " + vehicleClass + '\n' +
                "weight = " + weight + '\n' +
                "driver = " + driver + '\n' +
                "engine = " + engine;
    }
}
