package Lecture6_4.Task3;
//Создайте интерфейс Queue, описывающий требования к реализации очереди.
//Содержит следующие абстрактные методы:
//void add(int value) - добавляет целочисленное значение в очередь
//int remove() - удаляет значение из очереди
//boolean isEmpty() - возвращает true, если в очереди нет элементов
public interface Queue {
    void add(int value);
    int remove();
    boolean isEmpty();
}
