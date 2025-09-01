package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex15 {

    /*15. A série de Fibonacci é formada pela seqüência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,... Faça um programa capaz de gerar a série até o n−ésimo termo.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite até quantas casas você deseja ver a Fórmula de Fibonacci");
        int casa = scan.nextInt();
        int a = 1;
        int b = 0;
        int aux;

        for (int i = 0; i < casa; i++) {
            System.out.printf(" " + a);
            aux = a;
            a = a + b ;
            b = aux;
        }
        scan.close();
    }
}
