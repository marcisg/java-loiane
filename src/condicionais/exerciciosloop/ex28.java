package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex28 {

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
