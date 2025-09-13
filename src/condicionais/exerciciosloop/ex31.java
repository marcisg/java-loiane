package condicionais.exerciciosloop;

import java.util.Scanner;

public class ex31 {

    /*31- O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
    Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número desconhecido de valores
    referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa
    deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
    Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:

    Lojas Tabajara
    Produto 1: R$2,20
    Produto 2: R$5,80
    Produto 3: R$0
    Total: R$ 9,00
    Dinheiro: R$ 20,00
    Troco: R$ 11,00
    ...*/

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
