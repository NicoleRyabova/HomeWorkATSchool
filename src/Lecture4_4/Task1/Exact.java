package Lecture4_4.Task1;
//у класса Exact метод evaluate возвращает параметр без изменения
public class Exact implements Function{
    @Override
    public int evaluate(int number) {
        return number;
    }
}
