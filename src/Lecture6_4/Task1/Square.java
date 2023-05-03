package Lecture6_4.Task1;

import Lecture4_4.Task1.Function;

//у класса Square метод evaluate возвращает параметр, умноженный на сам себя
public class Square implements Function {
    @Override
    public int evaluate(int number) {
        return number * number;
    }
}
