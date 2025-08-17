package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int aux;

        while (a < 500) {
            System.out.printf(" " + a);
            aux = a;
            a = a + b ;
            b = aux;
        }
    }
}
