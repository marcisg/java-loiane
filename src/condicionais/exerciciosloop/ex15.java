package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex15 {

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
