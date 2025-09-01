package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex28 {

    /*28. Faça um programa que calcule o valor total investido por um colecionador na sua coleção de CDs e o valor médio gasto em cada um deles.
    O usuário deverá informar a quantidade de CDs e o valor para em cada um.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos CD's você tem?");
        int qtdcds = scan.nextInt();
        double totcds = 0;
        double media = 0;

        for (int i = 1; i <= qtdcds; i++) {
            System.out.println("Quanto você gastou no CD número "+ i +": ");
            double valorcd = scan.nextDouble();
            totcds = totcds + valorcd;
        }
        media = totcds / qtdcds;

        System.out.printf("O valor total investido foi de %.2f e a média de valores de todos os CD's é %.2f." , totcds, media);
    }

}
