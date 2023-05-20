package Lecture7_6.Task1;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> array;

    public Basket() {
        this.array = new ArrayList<>();
    }

    public void addItem(T item) {
        array.add(item);
    }
}
