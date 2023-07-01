package Lecture3_10;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Alchemy {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Ошибка! Нужно ввести хотя бы одно слово! ");
        }

        List<String> listOfElements = new ArrayList<>(List.of(args));
        List<NatureElement> natureElements = new ArrayList<>();

        try {
            listOfElements.forEach(element -> natureElements.add(NatureElement.create(element)));
        } catch (NoSuchElementException exception) {
            exception.printStackTrace();
            System.out.println("Такого элемента не существует");
            System.exit(1000);
        }

        for (int i = 0; i < natureElements.size(); i += 2) {
            try {
                NatureElement natureElement = natureElements.get(i);
                NatureElement natureElement2 = natureElements.get(i + 1);
                try {
                    System.out.println(natureElement + " + " + natureElement2 + " = " + natureElement.connect(natureElement2));
                }catch (UnsupportedOperationException exception){
                    exception.printStackTrace();
                    System.out.println("Объект не подходит под условия!");
                }
            } catch (IndexOutOfBoundsException exception) {
                exception.printStackTrace();
                System.out.println("У элемента нет пары");
            }

        }
    }
}
