package Lecture19.Task1;

public abstract class Animal {
    //Создание переменных для каждого животного
    String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected int counter;
    protected HealthState health;

    //Методы для переопределения
    abstract void makeSound();
    abstract void eat();
    abstract void sleep();

    //Метод для вывода сообщения
    @Override
    public abstract String toString();
}
