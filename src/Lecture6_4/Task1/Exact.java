package Lecture6_4.Task1;

import Lecture4_4.Task1.Function;

//у класса Exact метод evaluate возвращает параметр без изменения
public class Exact implements Function {
    @Override
    public int evaluate(int number) {
        return number;
    }
}
