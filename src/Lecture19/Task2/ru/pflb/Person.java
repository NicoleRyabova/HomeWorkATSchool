package Lecture19.Task2.ru.pflb;

public abstract class Person {
    public String name;
    public int age;

    //Создаю конструктор, в который будут передаваться значения переменных из main
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Создаю абстрактный toString для переопределения в классе Driver
    @Override
    public abstract String toString();
}
