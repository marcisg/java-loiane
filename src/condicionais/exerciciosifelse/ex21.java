package condicionais.exerciciosifelse;

import java.util.Scanner;

public class ex21 {

    /* 21. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão
    fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
    O programa não deve se preocupar com a quantidade de notas existentes na máquina.
    a. Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
    b. Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        int saque = scan.nextInt();
        int notade100 = 0;
        int notade50 = 0;
        int notade10 = 0;
        int notade5 = 0;
        int notade1 = 0;
        String qtdnota100 = "0";
        String qtdnota50 = "0";
        String qtdnota10 = "0";
        String qtdnota5 = "0";
        String qtdnota1 = "0";

        if (saque >=10 && saque <=600){
            if (saque/100 > 0){
                notade100 = (saque /100);
                qtdnota100 = (notade100 == 1) ? "nota de 100" : "notas de 100";
                System.out.printf("%d %s ", notade100, qtdnota100);
                System.out.println();
                saque = saque % 100;
            }
            if (saque/50 > 0) {
                notade50 = (saque / 50);
                qtdnota50 = (notade50 == 1) ? "nota de 50 " : "notas de 50";
                System.out.printf("%d %s ", notade50, qtdnota50);
                System.out.println();
                saque = saque % 50;
            }
            if (saque / 10 > 0) {
                notade10 = (saque / 10);
                qtdnota10 = (notade10 == 1) ? "nota de 10" : "notas de 10";
                System.out.printf("%d %s ", notade10, qtdnota10);
                System.out.println();
                saque = saque % 10;
            }
            if (saque / 5 > 0) {
                notade5 = (saque / 5);
                qtdnota5 = (notade5 == 1) ? "nota de 5" : "notas de 5";
                System.out.printf("%d %s ", notade5, qtdnota5);
                System.out.println();
                saque = saque % 5;
            }
            if (saque > 0){
                notade1 = (saque);
                qtdnota1 = (notade1 == 1) ? "nota de 1" : "notas de 1";
                System.out.printf("%d %s", notade1, qtdnota1);
                System.out.println();
            }
        }
        scan.close();

    }
}

