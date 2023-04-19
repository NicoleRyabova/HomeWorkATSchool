package Lecture5_5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
//В программу с алхимией из прошлой домашней работы добавьте:
//1) обработку следующих формул:
//    Energy + Water = Steam
//    Water + Energy = Steam
//2) обработка исключений
//   - в методе create класса NatureElement, если встретился неизвестный элемент,
//     то бросается java.util.NoSuchElementException, которое обрабатывается в основном классе Alchemy.
//     При обработке программа завершается.
//   - в методе connect класса NatureElement бросается UnsupportedOperationException вместо возвращения null
//   - в методе connect дочерних классов NatureElement бросается UnsupportedOperationException вместо возвращения null,
//     если объект не подошел под все условия.
//     Исключение обрабатывается в классе Alchemy, программа не завершается.

public class Alchemy {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Ошибка! Нужно ввести хотя бы одно слово!");
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
