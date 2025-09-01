package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex16 {

    /*16. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.*/

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
