package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas quase dois - Tabela de preços.");
        double valorprodutos = 0;

            for (int i = 1; i <= 50; i++) {
                valorprodutos = valorprodutos  + 1.99;
                System.out.printf("%d - R$ %.2f\n", i, valorprodutos);
            }
    }
}
