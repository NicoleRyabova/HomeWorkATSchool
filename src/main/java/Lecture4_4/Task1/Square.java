package Lecture4_4.Task1;
//у класса Square метод evaluate возвращает параметр, умноженный на сам себя
public class Square implements Function{
    @Override
    public int evaluate(int number) {
        return number * number;
    }
}
