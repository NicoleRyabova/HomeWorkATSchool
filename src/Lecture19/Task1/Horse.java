package Lecture19.Task1;

public class Horse extends Animal{
    //Создала метод, чтобы из main класса можно было прописывать значения для каждой переменной для этого класса
    public Horse(String name, String food, int foodCounter, String location, int counter, HealthState health){
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health;
    }

    //переопределение методов класса Animal
    @Override
    void makeSound() {
        System.out.println("Horse is neighing");
    }

    @Override
    void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    void sleep() {
        System.out.println("Horse is sleeping");
    }

    //В методе toString мы делаем вывод всей информации о питомце
    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "food = " + food + '\n' +
                "food counter = " + foodCounter + '\n' +
                "location = " + location + '\n' +
                "counter = " + counter + '\n' +
                "health = " + health;
    }
}
