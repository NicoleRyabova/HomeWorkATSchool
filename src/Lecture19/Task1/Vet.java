package Lecture19.Task1;

public class Vet {
    //Создала переменную с именев врача
    String name = "Alice";

    //Создала метод для того, чтобы из main класса можно было передавать название питомца в данный класс
    void getName(String name){
        this.name = name;
    }

    //Не поняла ак использовать локальную переменную типа Animal animal, поэтому пока сделала String
    void treatAnimal(String animal){
        System.out.println(animal + "  at a veterinarian's appointment");
        System.out.println(animal + " is cured");
    }
}
