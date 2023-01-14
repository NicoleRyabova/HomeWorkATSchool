package Lecture19.Task1;

public class Vet {
    //Создала переменную с именев врача
    String name;

    Vet(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.name + " is at a Dr." + name + "'s appointment");
        System.out.println(animal.name + " is cured");
    }
}
