package Lecture7_6.Task3;

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
    public Iterator<T> getIterator(){
        return array.keySet().iterator();
    }


}
