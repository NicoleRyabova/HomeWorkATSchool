package Lecture4_4.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Очередь #1:
//  Добавленные элементы: 1 3 2 4
//  Удален элемент: 1, оставшиеся элементы: 3 2 4
//  Удален элемент: 3, оставшиеся элементы: 2 4
//  Удален элемент: 2, оставшиеся элементы: 4
//  Удален элемент: 4, элементы отсутствуют
public class FirstQueue implements Queue{
    private static List<Integer> listOfNumbers = new ArrayList<>();
    private static int lastElement;

    @Override
    public void add(int value) {
        listOfNumbers.add(value);
    }

    @Override
    public int remove() {
        lastElement = listOfNumbers.get(0); // Переменная, с помощью которой из листа listOfNumbers определяется индекс начального элемента
        listOfNumbers.remove((Integer) lastElement);  // Из листа listOfNumbers удаляется первый элемент
        return lastElement;
    }

    @Override
    public boolean isEmpty() {
        return listOfNumbers.isEmpty(); // Возвращается true/false, в зависимости от того, является ли лист listOfNumbers пустым
    }
    public String replaces(String strings) { // С помощью этого метода можно отчистить вывод листа от запятых, скобок и т.д.
        return Arrays.toString(new String[]{strings}).replace("[", "")
                .replace("]", "")
                .replace(", ", " ");
    }
    public String printList(){ // При вызове этого метода печатается лист listOfNumbers (я его вызываю в Main классе, вместо того, чтобы напрямую обращаться к листу)
        return replaces(listOfNumbers.toString());
    }

    @Override
    public String toString() { // Возвращает определенное сообщение, в зависимости от того, является ли лист пустым
        return (isEmpty()) ? "Удалён элемент " + lastElement + ", элементы отсутствуют" : "Удалён элемент " + lastElement +
                ", оставшиеся элементы: " + replaces(listOfNumbers.toString());
    }
}
