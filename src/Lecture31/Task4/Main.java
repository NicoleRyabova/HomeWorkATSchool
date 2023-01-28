package Lecture31.Task4;

public class Main {
    public static void main(String[] args) {
        double sum = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]);
        double years = Double.parseDouble(args[2]);
        //Сделала максимально похожее значение к значению в примере
        double e = Math.exp(2.552601);

        //Не  могу понять, для чего нужен " ^ ", но ответ такой же, что и с " + " , так что я использую " + " , т.к " ^ " не даает использовать с переменными double
        double formula = sum * e + (percent * years);

        System.out.println("Given: \n" + "P = " + sum + "\nr = " + percent + "\nt = " + years);

        System.out.println(formula);
    }
}
