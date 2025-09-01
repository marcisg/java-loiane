package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        System.out.println("Lojas Tabajara.");
        double produtos = 0;
        double produtoatual = 1;
        boolean ativo = true;

        while (ativo){
            for (int i = 1; produtoatual != 0 ; i++) {
                System.out.printf("Produto "+i+": ");
                double valorproduto = scan.nextDouble();
                produtoatual = valorproduto;
                produtos = produtos + valorproduto;
            }
            System.out.printf("Total: R$ %.2f.\n", produtos);
            System.out.printf("Dinheiro: R$ ");
            double dinheiro = scan.nextDouble();
            dinheiro = dinheiro - produtos;
            System.out.printf("Troco: R$ %.2f.\n", dinheiro);
            produtos = 0;
            produtoatual = 1;

            System.out.println("Deseja continuar? (s ou n)");
            char continuar = read.next().charAt(0);

            if (continuar == 'n'){
                ativo = false;

            }
        }
    }
}
