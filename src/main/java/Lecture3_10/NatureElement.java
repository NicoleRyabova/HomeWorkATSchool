package Lecture3_10;

import java.util.NoSuchElementException;

public abstract class NatureElement {
    public abstract Object connect(NatureElement element) throws UnsupportedOperationException;

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
       // System.out.println("Unknown element");
        //System.exit(1000);
        //return null;
    }
}