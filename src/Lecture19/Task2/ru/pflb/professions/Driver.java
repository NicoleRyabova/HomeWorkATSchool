package Lecture19.Task2.ru.pflb.professions;

import Lecture19.Task2.ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience;
    int licenseId;

   public Driver(String name, int age, int drivingExperience, int licenseId){
        super(name, age);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }
// переопределяю toString из класса Person
    @Override
    public String toString() {
        return "Name - " + name + "\n"
                + "age - " + age + "\n"
                + "driving experience - " + drivingExperience + "\n"
                + "license ID - " + licenseId;
    }
}
