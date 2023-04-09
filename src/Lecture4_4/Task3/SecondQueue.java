package Lecture4_4.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// Очередь #2:
//  Добавленные элементы: 4 2 3 1
//  Удален элемент: 1, оставшиеся элементы: 4 2 3
//  Удален элемент: 2, оставшиеся элементы: 4 3
//  Удален элемент: 3, оставшиеся элементы: 4
//  Удален элемент: 4, элементы отсутствуют
public class SecondQueue implements Queue {
    private static List<Integer> listOfNumbers = new ArrayList<>(); // Создаю лист, в него будут добавляться элементы из листа listOfNumbersFromArgs из класса Main
    private int getElement;

    @Override
    public void add(int value) {
        listOfNumbers.add(value);
    }

    @Override
    public int remove() {
        int minElement = listOfNumbers.indexOf(Collections.min(listOfNumbers)); // Переменная, с помощью которой из листа listOfNumbers определяется индекс минимального элемента
        getElement = listOfNumbers.get(minElement); // С помощью этой переменной метод remove удаляет минимальный элемент из листа listOfNumbers
        listOfNumbers.remove(minElement); // Из листа listOfNumbers удаляется минимальный элемент

        return getElement;
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
        return (isEmpty()) ? "Удалён элемент " + getElement + ", элементы отсутствуют" : "Удалён элемент " + getElement +
                ", оставшиеся элементы: " + replaces(listOfNumbers.toString());
    }
}
