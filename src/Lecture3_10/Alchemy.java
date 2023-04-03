package Lecture3_10;

import java.util.ArrayList;
import java.util.List;

public class Alchemy {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Error! You should write at least one word!");
        }

        List<String> listOfElements = new ArrayList<>(List.of(args));
        List<NatureElement> natureElements = new ArrayList<>();
        listOfElements.forEach(element -> natureElements.add(NatureElement.create(element)));

        for (int i = 0; i < natureElements.size(); i += 2) {
            try {
                NatureElement natureElement = natureElements.get(i);
                NatureElement natureElement2 = natureElements.get(i + 1);
                System.out.println(natureElement + " + " + natureElement2 + " = " + natureElement.connect(natureElement2));
            } catch (IndexOutOfBoundsException exception) {
                exception.printStackTrace();
                System.out.println("У элемента нет пары");
            }

        }
    }
}
