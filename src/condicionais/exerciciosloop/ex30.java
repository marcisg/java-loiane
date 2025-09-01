package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Preço do pão: ");
        double valordopao = scan.nextDouble();
        System.out.println("Panificadora Pão de ontem - Tabela de preços.");
        double contadorpao = 0;

        for (int i = 1; i <= 50; i++) {
            contadorpao = valordopao  + contadorpao;
            System.out.printf("%d - R$ %.2f\n", i, contadorpao);
        }
    }
}
