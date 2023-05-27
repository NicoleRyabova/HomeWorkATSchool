package Lecture7_9.Task2;

import java.util.HashMap;
import java.util.Iterator;

public class Basket<T> {
    private HashMap<T, String> array;

    public Basket() {
        this.array = new HashMap();
    }

    public void addItem(T item) {
        array.put(item, "");
    }

    public Iterator<T> getIterator() {
        return array.keySet().iterator();
    }

    public int size() {
        return array.size();
    }
}
