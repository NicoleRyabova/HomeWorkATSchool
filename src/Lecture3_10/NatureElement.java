package Lecture3_10;

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
        }
        System.out.println("Unknown element");
        System.exit(1000);
        return null;
    }
}