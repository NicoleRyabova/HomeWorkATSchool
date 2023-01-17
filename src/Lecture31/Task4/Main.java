package Lecture31.Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args));
        int sum = Integer.parseInt(args[0]);
        int percent = Integer.parseInt(args[1]);
        int years = Integer.parseInt(args[2]);

        //Если честно, то я вообще не поняла, для чего нужна эта експонента, и так ли я ее вычисляю...
        int e = (int) Math.exp(2.5);
        int formula = sum * e ^ (percent * years);

        System.out.println("Given: \n" + "P = " + sum + "\nr = " + percent + "\nt = " + years);

        System.out.println(formula);


    }
}
