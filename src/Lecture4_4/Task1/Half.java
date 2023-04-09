package Lecture4_4.Task1;

//В этих классах реализуется метод evaluate:
//- у класса Half метод evaluate делит полученный параметр на 2
public class Half implements Function {
    @Override
    public int evaluate(int number) {
        return number / 2;
    }

    @Override
    public String toString() {
        return "Half";
    }
}
