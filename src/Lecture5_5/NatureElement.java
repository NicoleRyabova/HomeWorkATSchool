package Lecture5_5;

import java.util.NoSuchElementException;

public abstract class NatureElement {
    public abstract Object connect(NatureElement element);

    public static NatureElement create(String basicElementName) {
        switch (basicElementName) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Water":
                return new Water();
            case "Earth":
                return new Earth();
            default:
                throw new NoSuchElementException();
        }
    }
}